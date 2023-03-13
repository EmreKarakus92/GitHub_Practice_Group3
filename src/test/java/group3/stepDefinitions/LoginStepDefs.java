package group3.stepDefinitions;

import group3.pages.LoginPage;
import group3.utilities.ConfigurationReader;
import group3.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User enters valid username")
    public void user_enters_valid_username() {
        loginPage.usernameInputBox.sendKeys(ConfigurationReader.getProperty("username"));

    }

    @When("User enters valid password")
    public void user_enters_valid_password() {
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @When("User clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();
    }

    @Then("User should land on Dashboard page")
    public void user_should_land_on_dashboard_page() {
        String expectedTitle = "Dashboard - Seamlessly";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("User enters invalid username")
    public void userEntersInvalidUsername() {
        String username = "wrongName";
        loginPage.usernameInputBox.sendKeys(username);
    }

    @And("User enters invalid password")
    public void userEntersInvalidPassword() {
        String password = "wrongPassword";
        loginPage.passwordInputBox.sendKeys(password);
    }

    @Then("User should see error message")
    public void userShouldSeeErrorMessage() {
        Assert.assertTrue(loginPage.invalidCredentialsErrorMessage.isDisplayed());
    }


    @Given("user should be login")
    public void userShouldBeLogin() {
        loginPage.loginFunction();
    }
}
