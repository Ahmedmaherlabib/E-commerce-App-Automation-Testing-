package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    private By Email= By.id("Email");
    private By Paasword=By.id("Password");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enter_valid_Email_Password(String email,String password){
        setText(Email,email);
        setText(Paasword,password);
    }
    public void setText(By element,String value){
        driver.findElement(element).sendKeys(value);
    }
}
