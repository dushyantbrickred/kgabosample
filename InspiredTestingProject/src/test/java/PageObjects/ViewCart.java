package PageObjects;

import ObjectRepo.*;
import Utilities.ActionHelper;
import Utilities.DataHelper;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertTrue;

public class ViewCart extends ActionHelper {

    ProductsRepo productsRepo;
    ViewcartRepo viewcartRepo;
    DataHelper dataHelper;

    public ViewCart()
    {
        productsRepo = new ProductsRepo();
        viewcartRepo = new ViewcartRepo();
        dataHelper = new DataHelper();
    }

    public void clickSauceLabsBackpackLink(WebDriver driver) {
        clickObject(productsRepo.getSauceLabsBackpackLink(), driver);
    }

    public void clickAddToCartBtn(WebDriver driver) {
        clickObject(productsRepo.getAddToCartBtn(), driver);
    }

    public void clickCartLink(WebDriver driver) {
        clickObject(viewcartRepo.getCartLink(), driver);
    }

    public void clickRemoveBtn(WebDriver driver) {
        clickObject(viewcartRepo.getRemoveBtn(), driver);
    }

    public void clickMenuBarBtn(WebDriver driver) {
        clickObject(viewcartRepo.getMenuBarBtn(), driver);
    }

    public void clickHomepageLink(WebDriver driver) {
        clickObject(viewcartRepo.getHomeLink(), driver);
    }





}
