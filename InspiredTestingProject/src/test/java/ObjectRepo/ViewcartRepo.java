package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Factory;

public class ViewcartRepo {


    public By getCartLink(){return By.xpath("//*[@class='shopping_cart_link']");}

    public By getRemoveBtn(){return By.xpath("//*[contains(text(),'Remove')]");}

    public By getMenuBarBtn(){return By.xpath("//*[@id='react-burger-menu-btn']");}

    public By getHomeLink(){return By.xpath("//*[@id='inventory_sidebar_link']");}
}
