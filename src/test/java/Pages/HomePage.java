package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinition.Hooks;

public class HomePage {
    WebDriver driver;
    private By clickRegisLink=By.className("ico-register");
    private By clickLogLink=By.className("ico-login");
    private By link_registration=By.linkText("");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void click_regis_link(){
     driver.findElement(clickRegisLink).click();
    }
    public void click_login_link(){
        driver.findElement(clickLogLink).click();
    }

    public void navigateToHomePage(){
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

}
