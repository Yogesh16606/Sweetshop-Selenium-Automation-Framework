package utilities;

import org.openqa.selenium.By;

import drivers.DriverInstance;

public class NavigationUtil extends DriverInstance {

    public static void openBasket() {

        driver.findElement(By.xpath("//a[@href='/basket']")).click();
    }
}	