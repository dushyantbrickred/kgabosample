package ObjectRepo;

import org.openqa.selenium.By;

public class LoginRepo {

    public By getInputUsername()
    {
        return By.xpath("//input[@id='user-name']");
    }

    public By getInputPassword()
    {
        return By.xpath("//input[@type='password']");
    }

    public By getloginLink()
    {
        return By.xpath("//input[@id='login-button']");
    }

    public By getHomeTitle()
    {
        return By.xpath("//div[@class='app_logo']");
    }

}
