package group3.stepDefinitions;

import group3.pages.ContactsPage;
import group3.pages.LoginPage;
import group3.utilities.ConfigurationReader;
import group3.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ContactsStepDefs {

    LoginPage loginPage = new LoginPage();
    ContactsPage contactsPage = new ContactsPage();

    @When("user sees the contacts image")
    public void user_sees_the_contacts_image() {
        Assert.assertTrue(contactsPage.ContactsImage.isDisplayed());

    }
    @When("user clicks the contacts image")
    public void user_clicks_the_contacts_image() {
        contactsPage.ContactsImage.click();
    }

    @Then("user sees the all contacts button")
    public void user_sees_the_all_contacts_button() {
        Assert.assertTrue(contactsPage.linkAllContacts.isDisplayed());

    }
//    @Given("User is on the login page")
//    public void user_is_on_the_login_page() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//
//
//    }
//    @Given("user should be login")
//    public void user_should_be_login() {
//      loginPage.loginFunction();
//
//    }


//    @Then("User should land on Dashboard page")
//    public void user_should_land_on_dashboard_page() {
//
//        String expectedTitle = "Dashboard - Seamlessly";
//      String actualTitle = Driver.getDriver().getTitle();
//     Assert.assertEquals(expectedTitle, actualTitle);
//
//    }


}


