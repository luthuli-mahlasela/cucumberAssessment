package Steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
    public void i_enter_email(String email) {
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
        assert driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[4]/button/span[2]")).isDisplayed();
    }

}
