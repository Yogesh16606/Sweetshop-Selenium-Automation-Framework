package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import drivers.DriverInstance;

public class ScreenshotUtil extends DriverInstance {

    public static String captureScreenshot(String scenarioName) {

        File source =
                ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.FILE);

        String fileName =
                scenarioName.replaceAll(" ", "_")
                + ".png";

        String destination =
                "test-output/screenshots/"
                + fileName;

        File target = new File(destination);

        target.getParentFile().mkdirs();

        try {

            Files.copy(
                    source.toPath(),
                    target.toPath(),
                    StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {

            throw new RuntimeException(
                    "Unable to capture screenshot",
                    e);
        }

        return "screenshots/" + fileName;
    }
}