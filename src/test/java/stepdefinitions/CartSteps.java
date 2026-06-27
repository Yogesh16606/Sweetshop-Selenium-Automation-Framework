package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import workflows.CartPage;

public class CartSteps {

    CartPage cart = new CartPage();

    @Given("User launches cart application")
    public void user_launches_cart_application() {

    }

    @When("User opens sweets catalog page")
    public void user_opens_sweets_catalog_page() {
        cart.getCartPage();
    }

    @When("User adds all sweets to cart")
    public void user_adds_all_sweets_to_cart() {
        cart.addItemsToCart();
    }

    @Then("All sweets should be available in cart")
    public void all_sweets_should_be_available_in_cart() {
        cart.checkCartItems();
    }

    @When("User adds selected sweets to cart")
    public void user_adds_selected_sweets_to_cart() {
        cart.addSelectedItems();
    }

    @Then("Selected sweets should be available in cart")
    public void selected_sweets_should_be_available_in_cart() {
        cart.checkSelectedCartItems();
    }
}