package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.PendingException;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class stepDef {

    @Given("i am on the login page")
    public void i_am_on_the_login_page() {

    }

    @And("I enter email (.*)$")
    public void iEnterEmailEmail() {

    }
    @And("I enter password (.*)$")
    public void iEnterPasswordPassword() {

    }
    @When("I click login button")
    public void i_click_login_button() {

    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully() {

    }


    @And("I click on the logged in user")
    public void iClickOnTheLoggedInUser() {

    }

    @And("I click on the admin panel")
    public void iClickOnTheAdminPanel() {

    }

    @And("I click on the groups tab")
    public void iClickOnTheGroupsTab() {

    }

    @And("I click on the create group button")
    public void iClickOnTheCreateGroupButton() {

    }

    @And("I enter group name (.*)$")
    public void iEnterGroupNameGroupName() {

    }

    @And("I enter group description (.*)$")
    public void iEnterGroupDescriptionGroupDescription() {

    }

    @And("I enter year (.*)$")
    public void iEnterYearYear() {

    }

    @And("I enter max capacity (.*)$")
    public void iEnterMaxCapacityMaxCapacity() {

    }

    @And("I enter start date (.*)$")
    public void iEnterStartDateStartDate() {

    }

    @And("I enter end date (.*)$")
    public void iEnterEndDateEndDate() {

    }

    @Then("i should see the group created successfully")
    public void iShouldSeeTheGroupCreatedSuccessfully() {

    }
    @AfterStep
    public void addScreenshots(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshots = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshots, "image/png", "image");
        }
    }
}
