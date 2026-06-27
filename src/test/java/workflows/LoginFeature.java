package workflows;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import drivers.DriverInstance;
import pages.LoginPage;

public class LoginFeature extends DriverInstance {

    private LoginPage loginPage =
            new LoginPage();

    public void openLoginPage() {

    	loginPage.clickLoginPageButton();
    }	

    public void login(String userEmail, String userPassword) {

    	loginPage.enterEmail(userEmail);
    	loginPage.enterPassword(userPassword);
    	loginPage.clickLoginButton();
    }

    public void checkLoginHomePage() {

        Assert.assertFalse(
        		loginPage.getOrderPlacedText()
                .trim()
                .isEmpty(),
                "Order count is not displayed.");

        Assert.assertFalse(
        		loginPage.getFavouriteSweetText()
                        .trim()
                        .isEmpty(),
                "Favourite sweet is not displayed.");

        Assert.assertFalse(
        		loginPage.getTotalSpentText()
                        .trim()
                        .isEmpty(),
                "Total spent amount is not displayed.");
    }

    public void getTableData() {

    	Assert.assertTrue(
    	        loginPage.getOrderCount() > 0,
    	        "No previous orders displayed.");
    }
}