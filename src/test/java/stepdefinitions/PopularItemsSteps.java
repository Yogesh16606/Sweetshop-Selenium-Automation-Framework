package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import workflows.AddPopularItemsFromHomePage;

public class PopularItemsSteps {

    AddPopularItemsFromHomePage popular =
            new AddPopularItemsFromHomePage();

    @Given("User launches application for popular items validation")
    public void user_launches_application_for_popular_items_validation() {

    }

    @When("User adds all popular items from home page into basket")
    public void user_adds_all_popular_items_from_home_page_into_basket() {

        popular.addPopularItems();
    }

    @Then("All popular items should be added successfully into basket")
    public void all_popular_items_should_be_added_successfully_into_basket() {

        popular.checkPopularCartItems();
    }
}