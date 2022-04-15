package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import stepDefinition.Search;

import java.util.ArrayList;

public class SearchPage {
    WebDriver driver;
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    public void results(){
        int count=driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();
        Assert.assertTrue(count>0);
        ArrayList<String> itemsName=null;
        itemsName=new ArrayList<>();
        for (int i=0; i<count; i++){
            System.out.println(driver.findElements(By.cssSelector
                    ("h2[class=\"product-title\"] a")).get(i).getText());
            itemsName.add(driver.findElements(By.cssSelector
                    ("h2[class=\"product-title\"] a")).get(i).getText());
            /*Assert.assertTrue(driver.findElements(By.cssSelector
                    ("h2[class=\"product-title\"] a")).get(i).getText().contains("book"));*/

        }
        System.out.println(itemsName);
    }



}
