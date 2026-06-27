package workflows;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import drivers.DriverInstance;
import pages.CartCatalogPage;
import utilities.NavigationUtil;
import utilities.TestDataConstants;

public class CartPage extends DriverInstance {

    private CartCatalogPage cartCatalogPage =
            new CartCatalogPage();

    public void getCartPage() {

        cartCatalogPage.clickBrowseSweets();

        Assert.assertTrue(
                cartCatalogPage.isCupsImageDisplayed(),
                "Cart page was not opened successfully.");
    }

    int totalItemsSize;

    public void addItemsToCart() {

        totalItemsSize =
                cartCatalogPage.getAvailableProductsCount();

        Assert.assertTrue(
                totalItemsSize > 0,
                "No products available to add to basket.");

        cartCatalogPage.clickAllAddToBasketButtons();
    }

    public void addSelectedItems() {

        cartCatalogPage.addChocolateCups();

        cartCatalogPage.addSherbertStraws();

        cartCatalogPage.addSherbetDiscs();

        cartCatalogPage.addStrawberryBonBons();
    }

    public void checkCartItems() {

        NavigationUtil.openBasket();

        Assert.assertEquals(
                totalItemsSize,
                cartCatalogPage.getBasketItemsCount());
    }

    public void checkSelectedCartItems() {

        NavigationUtil.openBasket();
        
        Assert.assertEquals(
                cartCatalogPage.getBasketItemsCount(),
                TestDataConstants.EXPECTED_SELECTED_ITEMS_COUNT,
                "Selected items count does not match expected value.");
    }
}