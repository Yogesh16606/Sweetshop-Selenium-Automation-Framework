package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import workflows.RedirectToHomePage;

public class RedirectHomeSteps {

    RedirectToHomePage redirect = new RedirectToHomePage();

    @Given("User launches sweet shop application")
    public void user_launches_sweet_shop_application() {

    }
      
    @When("User clicks website logo from cart page")
    public void user_clicks_website_logo_from_cart_page() {

        redirect.clickWebsiteLogo();
    }

    @Then("User should be redirected to home page successfully")
    public void user_should_be_redirected_to_home_page_successfully() {

    }
}