package stepDefinition;

import Pages.ShoppingPage;
import io.cucumber.java.en.When;

public class SuccessfulOrder1 {
    ShoppingPage shoppingPage=new ShoppingPage(Hooks.driver);
    @When("user click checkout button")
    public void press() throws InterruptedException {
        shoppingPage.clickCheckoutButton();
    }
}
