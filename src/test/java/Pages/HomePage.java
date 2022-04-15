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
    private By ClickCurrencyList=By.cssSelector("div[class=\"currency-selector\"] select");
    private By ClickCurrencyEuro=By.xpath("//*[@id=\"customerCurrency\"]/option[2]");
    private By ClickCurrencyDollar=By.xpath("//*[@id=\"customerCurrency\"]/option[1]");

    private By itemsPrices=By.cssSelector("div[class=\"prices\"] span");

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
    public void ClickCurrencyList(){
        driver.findElement(ClickCurrencyList).click();
    }
    public void changeCurrencyTo_Euro(){
        driver.findElement(ClickCurrencyEuro).click();
    }
    public void changeCurrencyTo_Dollar(){
        driver.findElement(ClickCurrencyDollar).click();
    }
    public String itemsInEuro(){
       return driver.findElement(itemsPrices).getText();
    }
    public String itemsInDollar(){
        return driver.findElement(itemsPrices).getText();
    }

}
