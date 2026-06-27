package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import drivers.DriverInstance;

public class BasePage extends DriverInstance {

    public BasePage() {

        PageFactory.initElements(driver, this);
    }
	
	protected void click(WebElement element) {

        element.click();
    }

    protected void type(WebElement element,
                        String value) {

        element.clear();
        element.sendKeys(value);
    }

    protected String getText(WebElement element) {

        return element.getText();
    }

    protected boolean isDisplayed(WebElement element) {

        return element.isDisplayed();
    }
}
