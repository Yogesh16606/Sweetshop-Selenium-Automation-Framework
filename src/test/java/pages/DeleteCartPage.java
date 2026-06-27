package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.DriverInstance;
import utilities.WaitUtil;

public class DeleteCartPage extends BasePage {

    public DeleteCartPage() {

    	 super();
    }

    @FindBy(xpath = "//span[@id='basketCount']")
    private WebElement basketCount;

    @FindBy(xpath = "//li[@class='list-group-item d-flex justify-content-between']/strong")
    private WebElement totalAmount;

    @FindBy(xpath = "//a[@onclick='emptyBasket();']")
    private WebElement emptyBasketButton;

    @FindBy(xpath = "//ul[@id='basketItems']/li/div/h6")
    private List<WebElement> basketItems;

    @FindBy(xpath = "//li[contains(@class,'lh-condensed')]/div/h6")
    private List<WebElement> cartItems;

    @FindBy(xpath = "//a[@href='javascript:removeItem(2);']")
    private WebElement removeItemTwo;

    @FindBy(xpath = "//a[@href='javascript:removeItem(4);']")
    private WebElement removeItemFour;
    
    
    public void removeItemTwo() {

        removeItemTwo.click();
    }

    public void removeItemFour() {

        removeItemFour.click();
    }
   
    public void waitForRemoveItemFour() {

        WaitUtil.waitForVisibility(removeItemFour);
    }

    public String getBasketCount() {

        return basketCount.getText();
    }

    public String getTotalAmount() {

        return totalAmount.getText();
    }

    public void clickEmptyBasket() {

        emptyBasketButton.click();
    }

    public List<WebElement> getBasketItems() {

        return basketItems;
    }
}