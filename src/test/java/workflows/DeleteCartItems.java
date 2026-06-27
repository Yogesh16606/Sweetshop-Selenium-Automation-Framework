package workflows;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import drivers.DriverInstance;
import pages.DeleteCartPage;
import utilities.AlertUtil;
import utilities.FrameworkConstants;
import utilities.NavigationUtil;
import utilities.TestDataConstants;
import utilities.WaitUtil;

public class DeleteCartItems extends DriverInstance {

    private DeleteCartPage deleteCartPage =
            new DeleteCartPage();

    public void deleteAllItems() {

        NavigationUtil.openBasket();

        deleteCartPage.clickEmptyBasket();

        AlertUtil.acceptAlert();

        Assert.assertEquals(
                deleteCartPage.getBasketCount(),
                TestDataConstants.EMPTY_BASKET_COUNT,
                "Cart was not emptied successfully.");
    }

    public void deleteSelectedItems() {

        int beforeCount =
                deleteCartPage.getBasketItems().size();

        boolean itemFound = false;

        List<WebElement> itemsList =
                deleteCartPage.getBasketItems();

        for (WebElement ele : itemsList) {

            if (ele.getText().equals(TestDataConstants.SHERBERT_STRAWS)) {

            	deleteCartPage.removeItemTwo();

                AlertUtil.acceptAlert();

                itemFound = true;

                break;
            }
        }

        Assert.assertTrue(
                itemFound,
                "Sherbert Straws item was not found in the cart.");

        int afterCount =
                deleteCartPage.getBasketItems().size();

        Assert.assertTrue(
                afterCount < beforeCount,
                "Selected item was not removed from cart.");
    }

    public void deleteMultipleItems() {

        try {
            int beforeCount =
                    deleteCartPage.getBasketItems().size();

            deleteCartPage.removeItemTwo();

            AlertUtil.acceptAlert();

            WaitUtil.waitForSeconds(
                    FrameworkConstants.SHORT_WAIT);

            deleteCartPage.waitForRemoveItemFour();

            deleteCartPage.removeItemFour();

            AlertUtil.acceptAlert();

            int afterCount =
                    deleteCartPage.getBasketItems().size();

            Assert.assertTrue(
                    afterCount <= beforeCount - 2,
                    "Multiple items were not removed successfully.");

        } catch (Exception e) {

            throw new RuntimeException(
                    "Failed while deleting multiple cart items",
                    e);
        }
    }
}