package utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.DriverInstance;

public class DriverFactory extends DriverInstance {

    public static void initializeDriver() {

        if (driver == null) {

            ChromeOptions options = new ChromeOptions();

            // Detect GitHub Actions environment
            if (System.getenv("GITHUB_ACTIONS") != null) {

                options.addArguments("--headless=new");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--window-size=1920,1080");
            }

            driver = new ChromeDriver(options);

            if (System.getenv("GITHUB_ACTIONS") == null) {
                driver.manage().window().maximize();
            }
        }
    }

    public static void launchApplication() {

        initializeDriver();

        driver.get(
                ConfigReader.getProperty("baseUrl"));
    }
}