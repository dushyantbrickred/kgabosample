package PageObjects;

import ObjectRepo.LoginRepo;
import Utilities.ActionHelper;
import Utilities.DataHelper;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertTrue;

public class Login extends ActionHelper {

    LoginRepo loginRepo;
    DataHelper dataHelper;

    public Login()
    {
        loginRepo = new LoginRepo();
        dataHelper = new DataHelper();
    }


    public void enterUsername(WebDriver driver)
    {
        EnterValue(loginRepo.getInputUsername(), driver,"standard_user");
    }

    public void enterPassword(WebDriver driver)
    {
        EnterValue(loginRepo.getInputPassword(), driver, "secret_sauce");
    }

    public void clickSubmitButtonLink(WebDriver driver)
    {
        clickObject(loginRepo.getloginLink(),driver);
    }

    public  void titleVerification(WebDriver driver){
        assertTrue(IsElementPresent(loginRepo.getHomeTitle(),driver));
    }


}
