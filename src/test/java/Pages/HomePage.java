package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinition.Hooks;

public class HomePage {
    WebDriver driver;
    private By clickRegisLink=By.className("ico-register");
    private By clickLogLink=By.className("ico-login");
    private By clickSearchField=By.id("small-searchterms");
    private By clickSearchButton=By.xpath("//*[@id=\"small-search-box-form\"]/button");
    //public static String itemName="laptop";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void click_regis_link(){
     driver.findElement(clickRegisLink).click();
    }
    public void click_login_link(){
        driver.findElement(clickLogLink).click();
    }
    public void click_Search_field(){
        driver.findElement(clickSearchField).click();
    }
    public void navigateToHomePage(){
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    public void Enter_item_Name(String itemName){
        driver.findElement(clickSearchField).sendKeys(itemName);
    }
    public void clickSearchButton(){
        driver.findElement(clickSearchButton).click();
    }

}
