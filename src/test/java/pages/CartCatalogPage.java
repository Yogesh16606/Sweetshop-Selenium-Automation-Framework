package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.DriverInstance;

public class CartCatalogPage extends BasePage {

    public CartCatalogPage() {

    	 super();
    }

    @FindBy(xpath = "//a[normalize-space()='Browse Sweets']")
    private WebElement browseSweetsButton;

    @FindBy(xpath = "//img[@src='img/cups.jpg']")
    private WebElement cupsImage;

    @FindBy(xpath = "//a[text()='Add to Basket']")
    private List<WebElement> addToBasketButtons;

    @FindBy(xpath = "//a[@data-name='Chocolate Cups']")
    private WebElement chocolateCups;

    @FindBy(xpath = "//a[@data-name='Sherbert Straws']")
    private WebElement sherbertStraws;

    @FindBy(xpath = "//a[@data-name='Sherbet Discs']")
    private WebElement sherbetDiscs;

    @FindBy(xpath = "//a[@data-name='Strawberry Bon Bons']")
    private WebElement strawberryBonBons;

    @FindBy(xpath = "//span[@id='basketCount']")
    private WebElement basketCount;
    
    
    public void addChocolateCups() {

        chocolateCups.click();
    }

    public void addSherbertStraws() {

        sherbertStraws.click();
    }

    public void addSherbetDiscs() {

        sherbetDiscs.click();
    }

    public void addStrawberryBonBons() {

        strawberryBonBons.click();
    }
    
    public int getAvailableProductsCount() {

        return addToBasketButtons.size();
    }
    
    public void clickAllAddToBasketButtons() {

        for (WebElement ele : addToBasketButtons) {

            ele.click();
        }
    }
    
    public int getBasketItemsCount() {

        return Integer.parseInt(
                basketCount.getText());
    }
    

    public void clickBrowseSweets() {

        browseSweetsButton.click();
    }

    public boolean isCupsImageDisplayed() {

        return cupsImage.isDisplayed();
    }

  
}