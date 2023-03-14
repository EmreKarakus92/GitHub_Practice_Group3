package group3.stepDefinitions;

import group3.pages.LoginPage;
import group3.pages.TaskPage;
import group3.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class taskStepDefs {

    TaskPage taskPage=new TaskPage();

    @When("User clicks on the Tasks image")
    public void user_clicks_on_the_tasks_image() {
        taskPage.Task.click();
    }
    @When("User should land on Tasks Page")
    public void user_should_land_on_task_page() {
        String expectedTitle = "Tasks - Seamlessly";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
     @Then("User can see the tasks list")
        public void user_can_see_the_tasks() {
        Assert.assertTrue(taskPage.TaskList.isDisplayed());
        }




}
