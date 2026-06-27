package workflows;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.testng.Assert;

import drivers.DriverInstance;
import pages.MultipleQuantityPage;
import utilities.ExcelReader;
import utilities.FrameworkConstants;
import utilities.NavigationUtil;
import utilities.WaitUtil;

public class AddSameItemWithMultipleQty extends DriverInstance {

    private MultipleQuantityPage multipleQuantityPage =
            new MultipleQuantityPage();

    public void addSameItemWithMultipleQuantity() {

        try {

        	multipleQuantityPage.addChocolateCups();

            WaitUtil.waitForSeconds(
                    FrameworkConstants.SHORT_WAIT);

            multipleQuantityPage.addChocolateCups();

            WaitUtil.waitForSeconds(
                    FrameworkConstants.SHORT_WAIT);

            multipleQuantityPage.addSherbertStraws();

            WaitUtil.waitForSeconds(
                    FrameworkConstants.SHORT_WAIT);

            multipleQuantityPage.addSherbertStraws();

        } catch (Exception e) {

            throw new RuntimeException(
                    "Failed while adding multiple quantities to basket",
                    e);
        }
    }

    public void checkCartItems() {

        NavigationUtil.openBasket();
        
        ExcelReader reader =
                new ExcelReader(
                        FrameworkConstants.LOGIN_DATA_FILE);

        String productOne =
                reader.getProductName(
                        FrameworkConstants.FIRST_PRODUCT_ROW);

        String quantityOne =
                reader.getQuantity(
                        FrameworkConstants.FIRST_PRODUCT_ROW);

        String productTwo =
                reader.getProductName(
                        FrameworkConstants.SECOND_PRODUCT_ROW);

        String quantityTwo =
                reader.getQuantity(
                        FrameworkConstants.SECOND_PRODUCT_ROW);

        Assert.assertEquals(
                multipleQuantityPage.getProductName(0),
                productOne);

        Assert.assertEquals(
                multipleQuantityPage.getQuantityValue(0),
                quantityOne);

        Assert.assertEquals(
                multipleQuantityPage.getProductName(1),	
                productTwo);

        Assert.assertEquals(
                multipleQuantityPage.getQuantityValue(1),
                quantityTwo);

        String totalAmountValue =
                multipleQuantityPage.getTotalAmount();

        Assert.assertFalse(
                totalAmountValue.isEmpty(),
                "Total amount is not displayed.");
        
        reader.closeWorkbook();
    }
}