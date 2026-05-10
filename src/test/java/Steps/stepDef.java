package Steps;

import io.cucumber.java.After;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class stepDef {

    WebDriver driver;

    @Given("i am on login")
    public void i_am_on_login() {
        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div/div/nav/div[1]/div[3]/button")).click();
    }

    @And("I enter email (.*)$")
    public void i_enter_email(String email){
        driver.findElement(By.id("login-email")).sendKeys(email);
    }

    @And("I enter password (.*)$")
    public void i_enter_password(String password) {
        driver.findElement(By.id("login-password")).sendKeys(password);
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        driver.findElement(By.id("login-submit")).click();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {

        assert driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[1]/h2")).isDisplayed();

    }

    @Given("I navigate to admin panel")
    public void iNavigateToAdminPanel()  {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button")).click();
        //*[@id="app-root"]/nav/div[1]/div[3]/div/button
        //*[@id="app-root"]/nav/div[1]/div[3]/div/button/span[2]
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/div/button[4]/span[2]")).click();

    }

    @When("I click on group")
    public void iClickOnGroup() {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/div[2]/nav/button[4]")).click();

    }

    @And("I create a group")
    public void iCreateAGroup() {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[2]/button")).click();
        driver.getWindowHandle();
        // driver.switchTo().window();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[1]/input")).sendKeys("Dusty Group");
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[3]/div[2]/input")).sendKeys("10");
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[4]/div[1]/input")).sendKeys("05/10/2026");
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[4]/div[2]/input")).sendKeys("12/12/2026");
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/div[3]/div/div[4]/div/form/div[5]/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/div[2]/div[2]/button")).click();

    }

    @Then("I logout from site")
    public void iLogoutFromSite() {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/div/button[5]/span[2]")).click();

    }

    @And("I navigate to sign-up")
    public void iNavigateToSignUp() {
        driver.findElement(By.xpath("/html/body/div/div/nav/div[1]/div[3]/button")).click();
        driver.findElement(By.id("signup-toggle")).click();
    }

    @Then("I validate that the group created exist")
    public void iValidateThatTheGroupCreatedExist() {

        driver.findElement(By.id("register-group")).click();
        assert driver.findElement(By.xpath("")).isDisplayed();
    }


    @After
    public void closeBrowser() {
        driver.quit();
    }
}
