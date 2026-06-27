package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import workflows.AddSameItemWithMultipleQty;

public class MultipleQuantitySteps {

    AddSameItemWithMultipleQty multipleQty =
            new AddSameItemWithMultipleQty();

    @Given("User launches application for multiple quantity validation")
    public void user_launches_application_for_multiple_quantity_validation() {

    }

    @When("User adds same products multiple times into basket")
    public void user_adds_same_products_multiple_times_into_basket() {

        multipleQty.addSameItemWithMultipleQuantity();
    }

    @Then("Product quantities should be updated successfully in basket")
    public void product_quantities_should_be_updated_successfully_in_basket() {

        multipleQty.checkCartItems();
    }
}