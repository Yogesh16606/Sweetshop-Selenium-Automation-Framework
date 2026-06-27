package workflows;

import org.testng.Assert;

import pages.HomePage;
import utilities.NavigationUtil;

public class RedirectToHomePage {

    private HomePage homePage = new HomePage();

    public void clickWebsiteLogo() {

        NavigationUtil.openBasket();

        homePage.clickWebsiteLogo();

        Assert.assertEquals(
                homePage.getWelcomeText(),
                "Welcome to the sweet shop!");
    }
}