package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.DriverInstance;

public class MultipleQuantityPage extends BasePage {

    public MultipleQuantityPage() {

    	super();
    }

    @FindBy(xpath = "//a[@data-name='Chocolate Cups']")
    private WebElement chocolateCups;

    @FindBy(xpath = "//a[@data-name='Sherbert Straws']")
    private WebElement sherbertStraws;

    @FindBy(xpath = "//span[@id='basketCount']")
    private WebElement basketCount;
    																																																
    @FindBy(xpath = "//li[contains(@class,'lh-condensed')]/div/h6")
    private List<WebElement> productNames;

    @FindBy(xpath = "//li[contains(@class,'lh-condensed')]/div/small")
    private List<WebElement> quantityValues;

    @FindBy(xpath = "//li[contains(@class,'justify')]/strong")
    private WebElement totalAmount;

    
    public void addChocolateCups() {

        chocolateCups.click();
    }

    public void addSherbertStraws() {

        sherbertStraws.click();
    }
    
    public String getProductName(int index) {

        return productNames.get(index).getText();
    }

    public String getQuantityValue(int index) {

        return quantityValues.get(index).getText();
    }

    public String getBasketCount() {
        return basketCount.getText();
    }																										

    public String getTotalAmount() {
        return totalAmount.getText();
    }
}												