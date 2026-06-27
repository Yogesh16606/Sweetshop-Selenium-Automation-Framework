package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.DriverInstance;

public class HomePage extends BasePage {

    public HomePage() {

    	super();
    }

    @FindBy(xpath = "//a[@class='navbar-brand']")
    private WebElement websiteLogo;

    @FindBy(xpath = "//h1[@class='display-3']")
    private WebElement welcomeText;

    public void clickWebsiteLogo() {

        websiteLogo.click();
    }

    public String getWelcomeText() {

        return welcomeText.getText();
    }
}