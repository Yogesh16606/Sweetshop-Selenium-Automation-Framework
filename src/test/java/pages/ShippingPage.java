package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.DriverInstance;

public class ShippingPage extends BasePage {

    public ShippingPage() {

    	super();
    }

    @FindBy(xpath = "//label[@for='exampleRadios2']")
    private WebElement shippingOption;

    @FindBy(xpath = "//li[contains(@class, 'list-group-item')]/strong")
    private WebElement shippingAmount;

    public void clickShippingOption() {

        shippingOption.click();
    }

    public String getShippingAmount() {

        return shippingAmount.getText();
    }
}