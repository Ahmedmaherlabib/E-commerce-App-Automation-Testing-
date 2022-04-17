package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinition.Hooks;

import java.time.Duration;

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
    private WebElement computerCategory;
    private WebElement ElectronicCategory;
    private WebElement ApparelCategory;
    private WebElement DigitalDownloadCategory;
    private WebElement BooksCategory;
    private WebElement JewelryCategory;
    private WebElement GiftsCardCategory;
    private WebElement SoftwareSubcategory;
    private WebElement CamerasSubcategory;
    private WebElement NoteBooksSubcategory;
    private WebElement ApparelShoes;

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
    public void hover_in_categories() throws InterruptedException {
        Actions actions=new Actions(driver);
        computerCategory =driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
        ElectronicCategory=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));
        ApparelCategory =driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a"));
        BooksCategory=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a"));
        JewelryCategory=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a"));
        GiftsCardCategory=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[7]/a"));
        DigitalDownloadCategory=driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[4]/a"));

        actions.moveToElement(GiftsCardCategory).perform();
        Thread.sleep(1000);
        actions.moveToElement(JewelryCategory).perform();
        Thread.sleep(1000);
        actions.moveToElement(BooksCategory).perform();
        Thread.sleep(1000);
        actions.moveToElement(DigitalDownloadCategory).perform();
        Thread.sleep(1000);
        actions.moveToElement(ElectronicCategory).perform();
        Thread.sleep(1000);
        actions.moveToElement(computerCategory).perform();
        Thread.sleep(1000);
        actions.moveToElement(ApparelCategory).perform();
        Thread.sleep(1000);
    }
public void click_on_subcategory() throws InterruptedException {
        ApparelCategory=driver.findElement(By.cssSelector("a[href=\"/shoes\"]"));
  ApparelCategory.click();
    Thread.sleep(2000);
    //driver.getCurrentUrl();
}
    public String getUrl() throws InterruptedException {
        Thread.sleep(2000);
        return driver.getCurrentUrl();

}
}
