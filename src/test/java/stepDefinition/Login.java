package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class Login {
    @And("user press login link")
    public void click_login_link(){
        Hooks.driver.findElement(By.className("ico-login")).click();
    }
    @When("user enter valid username and password")
    public void enter_valid_data(){
        Hooks.driver.findElement(By.id("Email")).sendKeys("test3@example.com");
        Hooks.driver.findElement(By.id("Password")).sendKeys("password");

    }
    @And("user click on login button")
    public void click_button(){
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]")).click();

    }

    @Then("user could login successfully and go to home page")
    public void userCouldLoginSuccessfullyAndGoToHomePage() {
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals(Hooks.driver.findElement
                (By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[2]/div[1]/h2")).getText(),"Welcome to our store");
    }
}
