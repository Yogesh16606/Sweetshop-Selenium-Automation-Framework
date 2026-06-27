package utilities;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriverInstance;

public class WaitUtil extends DriverInstance {

	static WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(FrameworkConstants.LONG_WAIT));
	
    public static void waitForSeconds(long seconds) {

        try {

            Thread.sleep(seconds * 1000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    public static void waitForVisibility(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForClickable(WebElement element) {

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    
    public static void waitForAlert() {

        wait.until(ExpectedConditions.alertIsPresent());
    }
}