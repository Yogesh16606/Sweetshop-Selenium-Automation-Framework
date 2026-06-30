package utilities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriverInstance;

public class AlertUtil extends DriverInstance {

    public static void acceptAlert() {

        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(5));

        Alert alert =
                wait.until(
                        ExpectedConditions.alertIsPresent());

        alert.accept();

        wait.until(ExpectedConditions.not(
                ExpectedConditions.alertIsPresent()));
    }
}