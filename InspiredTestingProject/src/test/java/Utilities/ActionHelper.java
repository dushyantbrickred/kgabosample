package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ActionHelper {


    public void clickObject(By sElement, WebDriver driver) {
        try {
            //WaitForElementClickable(sElement, driver);

            driver.findElement(sElement).click();
        } catch (Exception e) {
            System.out.println("Unable to click object " + e.getMessage());
        }
    }

    public void EnterValue(By sElement, WebDriver driver, String Value) {
        try {
            //WaitForElementClickable(sElement, driver);

            WebElement txt = driver.findElement(sElement);
            txt.clear();
            txt.sendKeys(Value);
        } catch (Exception e) {
            System.out.println("Unable to enter Value " + e.getMessage());
        }
    }


    public void ClearFieldValue(By sElement, WebDriver driver) {
        try {
            //WaitForElementClickable(sElement, driver);

            driver.findElement(sElement).clear();
        } catch (Exception e) {
            System.out.println("Unable to Clear Field " + e.getMessage());
        }
    }

    public Boolean IsElementPresent(By by, WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//seconds 0 so that WebDriver doesn't implicitly wait
        try {
            driver.findElement(by);
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//seconds back to 30 after the action is complete
        }
    }

    public void ScrollToElement(By sElement, WebDriver driver) {
        //WaitForElementVisible(sElement, driver);
        WebElement txt = driver.findElement(sElement);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txt);

    }

    public boolean CheckisDisplayed(By sElement, WebDriver driver)
    {
        boolean isDisplayed = false;
        try
        {
            isDisplayed = driver.findElement(sElement).isDisplayed();
        }
        catch (Exception e)
        {
            System.out.println("Object not displayed " + e.getMessage());
        }
        return isDisplayed;

    }

    public String GetTextOfElement(By sElement, WebDriver driver)
    {
        String value = null;
        try
        {

            value = driver.findElement(sElement).getText();
        }
        catch (Exception e)
        {
            System.out.println("Unable to get attribute value " + e.getMessage());
        }
        return value;
    }


}
