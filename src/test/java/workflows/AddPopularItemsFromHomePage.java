package workflows;

import org.testng.Assert;

import drivers.DriverInstance;
import pages.PopularItemsPage;
import utilities.NavigationUtil;

public class AddPopularItemsFromHomePage extends DriverInstance {

    private PopularItemsPage popularItemsPage =
            new PopularItemsPage();

    int totalItemsSize;

    public void addPopularItems() {

        totalItemsSize =
                popularItemsPage.getAddToBasketButtonsCount();

        Assert.assertTrue(
                totalItemsSize > 0,
                "No popular items found on home page.");

        popularItemsPage.clickAllAddToBasketButtons();
    }

    public void checkPopularCartItems() {

        NavigationUtil.openBasket();

        Assert.assertEquals(
                totalItemsSize,
                popularItemsPage.getBasketItemsCount(),
                "Popular items count in basket does not match expected count.");
    }
}