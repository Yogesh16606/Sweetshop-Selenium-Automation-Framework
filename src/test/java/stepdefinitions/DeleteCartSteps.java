package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import workflows.CartPage;
import workflows.DeleteCartItems;

public class DeleteCartSteps {

    CartPage cart = new CartPage();
    DeleteCartItems deleteCart = new DeleteCartItems();

    @Given("User launches cart application for deletion")
    public void user_launches_cart_application_for_deletion() {

    }

    @When("User opens sweets catalog page for deletion")
    public void user_opens_sweets_catalog_page_for_deletion() {
        cart.getCartPage();
    }

    @When("User adds all sweets into cart")
    public void user_adds_all_sweets_into_cart() {
        cart.addItemsToCart();
    }

    @When("User adds selected sweets into cart")
    public void user_adds_selected_sweets_into_cart() {
        cart.addSelectedItems();
    }

    @When("User navigates to cart for all item deletion")
    public void user_navigates_to_cart_for_all_item_deletion() {
        cart.checkCartItems();
    }

    @When("User navigates to cart for selected item deletion")
    public void user_navigates_to_cart_for_selected_item_deletion() {
        cart.checkSelectedCartItems();
    }

    @When("User deletes all cart items")
    public void user_deletes_all_cart_items() {
        deleteCart.deleteAllItems();
    }

    @When("User deletes selected cart item")
    public void user_deletes_selected_cart_item() {
        deleteCart.deleteSelectedItems();
    }

    @When("User deletes multiple cart items")
    public void user_deletes_multiple_cart_items() {
        deleteCart.deleteMultipleItems();
    }

    @Then("Cart should be empty")
    public void cart_should_be_empty() {

    }

    @Then("Selected item should be removed from cart")
    public void selected_item_should_be_removed_from_cart() {

    }

    @Then("Multiple items should be removed from cart")
    public void multiple_items_should_be_removed_from_cart() {

    }
}