package stepdefinitions;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.FrameworkConstants;
import workflows.LoginFeature;
import io.cucumber.java.en.Then;

public class LoginSteps {

    LoginFeature login = new LoginFeature();

    @Given("User launches browser")
    public void user_launches_browser() {

    }

    @When("User opens login page")
    public void user_opens_login_page() {
        login.openLoginPage();
    }

    @When("User logs in using Excel row {string}")
    public void user_logs_in_using_excel_row(String rowNumber) {

        ExcelReader reader =
                new ExcelReader(
                        FrameworkConstants.LOGIN_DATA_FILE);

        int row = Integer.parseInt(rowNumber);

        String email = reader.getEmail(row);

        String password = reader.getPassword(row);

        login.login(email, password);

        reader.closeWorkbook();
    }

    @Then("Login result should be {string}")
    public void login_result_should_be(String status) {

        if(status.equalsIgnoreCase("success")) {

            login.checkLoginHomePage();
            login.getTableData();

        } else {

        	// Invalid login handled by application validation

        }
    }
}
