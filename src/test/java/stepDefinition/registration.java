package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class registration {
    WebDriver driver;
    @Given("user open chrome driver")
    public void open_chrome(){
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
         driver.manage().window().maximize();

    }
    @And("user navigate to home page")
    public void navigate_home() {
        WebDriverManager.chromedriver().setup();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @And("user press registration link")
    public void click_regis_link(){
        driver.findElement(By.className("ico-register")).click();
    }
    @And("user quite driver")
    public void quite_driver(){
        driver.quit();
    }
    @When("user fills Your Personal Details with valid data")
    public void personal_info(){
        driver.findElement(By.id("FirstName")).sendKeys("automation");
        driver.findElement(By.id("LastName")).sendKeys("tester");
        driver.findElement(By.id("Email")).sendKeys("test@example.com");
    }
    @And("user fills Your Password Details with valid data")
    public void password(){
        driver.findElement(By.id("Password")).sendKeys("password");
        driver.findElement(By.id("ConfirmPassword ")).sendKeys("password");
    }
    @And("user press on register button")
    public void press_register_button(){
        driver.findElement(By.id("register-button")).click();
    }
    @Then("user register successfully")
    public void register_successfully(){
        //driver.findElement(By.className("result")).isDisplayed();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(driver.findElement(
                By.partialLinkText("Your registration completed")).isDisplayed());
        softAssert.assertAll();


    }
}
