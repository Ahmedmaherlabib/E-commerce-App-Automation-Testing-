package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ShoppingPage {
    WebDriver driver;
    private By SelectedItem1=By.xpath("(//a[@class=\"product-name\"])[1]");
    private By SelectedItem2=By.xpath("(//a[@class=\"product-name\"])[2]");

    public ShoppingPage(WebDriver driver) {
        this.driver = driver;
    }
    public String findItemsNum3Choosen(){
        return driver.findElement(SelectedItem1).getText();
    }
    public String findItemsNum2Choosen(){
        return driver.findElement(SelectedItem2).getText();
    }
}
