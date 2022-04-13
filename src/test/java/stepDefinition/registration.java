package stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;

public class registration {

    @And("user navigate to home page")
    public void navigate_home() {
        WebDriverManager.chromedriver().setup();
            Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @And("user press registration link")
    public void click_regis_link(){
        Hooks.driver.findElement(By.className("ico-register")).click();
    }

    @When("user fills Your Personal Details with valid data")
    public void personal_info(){
        Hooks.driver.findElement(By.id("FirstName")).sendKeys("automation1");
        Hooks.driver.findElement(By.id("LastName")).sendKeys("tester2");
        Hooks.driver.findElement(By.id("Email")).sendKeys("test3@example.com");
    }
    @And("user fills Your Password Details with valid data")
    public void password(){
        Hooks.driver.findElement(By.id("Password")).sendKeys("password");
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys("password");
    }
    @And("user press on register button")
    public void press_register_button(){
        Hooks.driver.findElement(By.id("register-button")).click();
    }
    @Then("user register successfully")
    public void register_successfully()  {
        //driver.findElement(By.className("result")).isDisplayed();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(  Hooks.driver.findElement(By.className("result")).isDisplayed());
        softAssert.assertAll();


    }
    }
