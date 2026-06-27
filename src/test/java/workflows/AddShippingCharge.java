package workflows;

import org.testng.Assert;

import pages.ShippingPage;
import utilities.ExcelReader;
import utilities.FrameworkConstants;
import utilities.NavigationUtil;

public class AddShippingCharge {

    private ShippingPage shippingPage =
            new ShippingPage();

    public void clickShippingCharge() {

        NavigationUtil.openBasket();
        
        ExcelReader reader =
                new ExcelReader(
                        FrameworkConstants.LOGIN_DATA_FILE);

        String expectedShippingCharge =
                reader.getExpectedShippingCharge();

        shippingPage.clickShippingOption();

        String cartAmountValue =
                shippingPage.getShippingAmount();

        Assert.assertEquals(
                cartAmountValue,
                expectedShippingCharge);
        
        reader.closeWorkbook();
    }

    public void clickShippingChargeFailure() {

        NavigationUtil.openBasket();
        
        ExcelReader reader =
                new ExcelReader(
                        FrameworkConstants.LOGIN_DATA_FILE);

        String expectedShippingCharge =
                reader.getExpectedShippingCharge();

        shippingPage.clickShippingOption();

        String cartAmountValue =
                shippingPage.getShippingAmount();

        Assert.assertEquals(
                cartAmountValue,
                expectedShippingCharge);
        
        reader.closeWorkbook();
    }
}