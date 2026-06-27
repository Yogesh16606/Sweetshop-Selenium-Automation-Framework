package utilities;

import drivers.DriverInstance;

public class AlertUtil extends DriverInstance {

    public static void acceptAlert() {

        driver.switchTo().alert().accept();
    }
}