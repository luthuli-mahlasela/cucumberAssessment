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

public class stepDef extends Base {

    @Given("i am on the login page")
    public void i_am_on_the_login_page() {
        homePage.clickLoginButton();
        loginPage.verifyLoginPageIsDisplayed();
    }

    @And("I enter email (.*)$")
    public void iEnterEmailEmail(String email) {
        loginPage.enterEmail(email);
    }

    @And("I enter password (.*)$")
    public void iEnterPasswordPassword(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click login button")
    public void i_click_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        dashboardPage.verifyDashboardPageIsDisplayed();
    }


    @And("I click on the logged in user")
    public void iClickOnTheLoggedInUser() {
        dashboardPage.clickUserMenuButton_xpath();
    }

    @And("I click on the admin panel")
    public void iClickOnTheAdminPanel() {
        dashboardPage.clickAdminPanelButton_xpath();
    }

    @And("I click on the groups tab")
    public void iClickOnTheGroupsTab() {
        dashboardPage.clickGroupsButton();

    }

    @And("I click on the create group button")
    public void iClickOnTheCreateGroupButton() {
        dashboardPage.clickCreateNewGroup();
    }

    @And("I enter group name (.*)$")
    public void iEnterGroupNameGroupName(String groupName) throws InterruptedException {
        dashboardPage.groupNameInput(groupName);
    }

    @And("I enter group description (.*)$")
    public void iEnterGroupDescriptionGroupDescription(String groupDescription) {
        dashboardPage.groupDescriptionArea(groupDescription);
    }

    @And("I enter year (.*)$")
    public void iEnterYearYear(String year) {
        dashboardPage.enterGroupYear(year);
    }

    @And("I enter max capacity (.*)$")
    public void iEnterMaxCapacityMaxCapacity(String maxCapacity) {
        dashboardPage.enterMaxCapacity(maxCapacity);
    }

    @And("I enter start date (.*)$")
    public void iEnterStartDateStartDate(String startDate) {
        dashboardPage.enterStartDate(startDate);
    }

    @And("I enter end date (.*)$")
    public void iEnterEndDateEndDate(String endDate) {
        dashboardPage.enterEndDate(endDate);
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
