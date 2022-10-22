package stepDefinitions;

import PageObjects.ViewCart;
import PageObjects.Login;
import Utilities.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class QaWebTests {

    private static WebDriver driver;
    Login login;
    TestBase testBase;
    ViewCart viewCart;

    public QaWebTests(){
        testBase = new TestBase();
        login = new Login();
        viewCart = new ViewCart();

    }

    @Given("user navigates to online shop")
    public void user_navigates_to_online_shop() {
        driver=testBase.SetupBrowser();
    }
    @When("User enter Username and Password")
    public void user_enter_username_and_password() {
        login.enterUsername(driver);
        login.enterPassword(driver);
        login.clickSubmitButtonLink(driver);

    }
    @Then("login should be successful")
    public void login_should_be_successful() {
        login.titleVerification(driver);
    }


    @Given("User Select a backpack")
    public void user_select_a_backpack() {
        viewCart.clickSauceLabsBackpackLink(driver);
    }
    @When("User Add a backpack to cart")
    public void user_add_a_backpack_to_cart() {
        viewCart.clickAddToCartBtn(driver);
    }
    @When("User View the cart")
    public void user_view_the_cart() {
        viewCart.clickCartLink(driver);

    }
    @Then("User Remove backpack from cart")
    public void user_remove_backpack_from_cart() {
        viewCart.clickRemoveBtn(driver);
    }
    @Then("User navigate to home page")
    public void user_navigate_to_home_page() {
        viewCart.clickMenuBarBtn(driver);
        viewCart.clickHomepageLink(driver);
    }

}
