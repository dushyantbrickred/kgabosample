package ObjectRepo;

import org.openqa.selenium.By;

public class ProductsRepo {

    public By getSauceLabsBackpackLink(){return By.xpath("//*[contains(text(),'Sauce Labs Backpack')]");
    }

    public By getAddToCartBtn(){return By.xpath("//*[contains(text(),'Add to cart')]");
    }
}
