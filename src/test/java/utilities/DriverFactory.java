package utilities;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriverInstance;

public class DriverFactory extends DriverInstance {

    public static void initializeDriver() {

        if (driver == null) {

            driver = new ChromeDriver();

            driver.manage().window().maximize();
        }
    }

    public static void launchApplication() {

        initializeDriver();

        driver.get(
            ConfigReader.getProperty("baseUrl"));
    }
}