package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.DriverInstance;

public class PopularItemsPage extends BasePage {

    public PopularItemsPage() {

    	super();
    }

    @FindBy(xpath = "//a[text()='Add to Basket']")
    private List<WebElement> addToBasketButtons;

    @FindBy(xpath = "//div[@class='card-body']/h4")
    private List<WebElement> popularItems;

    @FindBy(xpath = "//span[@id='basketCount']")
    private WebElement basketCount;

    @FindBy(xpath = "//li[contains(@class,'lh-condensed')]/div/h6")
    private List<WebElement> cartItems;
    
    
    public int getBasketItemsCount() {

        return Integer.parseInt(
                basketCount.getText());
    }

    public int getAddToBasketButtonsCount() {

        return addToBasketButtons.size();
    }

    public void clickAllAddToBasketButtons() {

        for (WebElement ele : addToBasketButtons) {

            ele.click();
        }
    }
}