package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.DriverInstance;

public class LoginPage extends BasePage {

    public LoginPage() {

    	super();
    }

    @FindBy(xpath = "//a[normalize-space()='Login']")
    private WebElement loginPageBtn;

    @FindBy(xpath = "//input[@id='exampleInputEmail']")
    private WebElement email;	

    @FindBy(xpath = "//input[@id='exampleInputPassword']")
    private WebElement password;

    @FindBy(xpath = "//button[@id='btn_login']")
    private WebElement loginBtn;

    @FindBy(xpath = "//div[@class='invalid-feedback invalid-email']")
    private WebElement errorMsg;

    @FindBy(xpath = "//p[contains(@id, 'accountOrderCount')]")
    private WebElement orderPlaced;

    @FindBy(xpath = "//p[contains(@id, 'accountFavouriteSweet')]")
    private WebElement favSweet;

    @FindBy(xpath = "//p[contains(@id, 'accountTotalSpend')]")
    private WebElement totalSpent;

    @FindBy(xpath = "//tbody[contains(@id, 'transactionsBody')]/tr/th")
    private List<WebElement> orderNum;

    @FindBy(xpath = "//tbody[contains(@id, 'transactionsBody')]/tr/td")
    private List<WebElement> ordersData;
    
    public void clickLoginPageButton() {

        click(loginPageBtn);
    }

    public void enterEmail(String userEmail) {

        type(email, userEmail);
    }

    public void enterPassword(String userPassword) {

        type(password, userPassword);
    }

    public void clickLoginButton() {

        click(loginBtn);
    }

    public String getOrderPlacedText() {

        return getText(orderPlaced);
    }

    public String getFavouriteSweetText() {

        return getText(favSweet);
    }

    public String getTotalSpentText() {

        return getText(totalSpent);
    }
    
    public int getOrderCount() {

        return orderNum.size();
    }
}