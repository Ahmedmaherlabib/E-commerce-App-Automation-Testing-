package Pages;

import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ShoppingPage {
    WebDriver driver;
    private By SelectedItem1=By.xpath("(//a[@class=\"product-name\"])[1]");
    private By SelectedItem2=By.xpath("(//a[@class=\"product-name\"])[2]");
    private By termsCheckBox=By.id("termsofservice");
    private By CheckoutButton=By.id("checkout");
    private By CheckoutButton1=By.xpath("//*[@id=\"shopping-cart-form\"]/di" +
            "v[3]/div[2]/div[3]/label");

    public ShoppingPage(WebDriver driver) {
        this.driver = driver;
    }
    public String findItemsNum3Choosen(){
        return driver.findElement(SelectedItem1).getText();
    }
    public String findItemsNum2Choosen(){
        return driver.findElement(SelectedItem2).getText();
    }
    public void clickCheckoutButton() throws InterruptedException {
       // Actions actions=new Actions(driver);
       // driver.findElement(termsCheckBox).click();
        driver.findElement(CheckoutButton1).click();
        Thread.sleep(1000);
        //driver.findElement(CheckoutButton).click();

    }
}
