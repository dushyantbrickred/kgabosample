package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;

    public WebDriver SetupBrowser()
    {
        switch ("Chrome") {
            case "Chrome":
                String driverPathChrome = System.getProperty("user.dir")+"/src/Drivers/chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", driverPathChrome);


                ChromeOptions capability = new ChromeOptions();
                capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

                driver = new ChromeDriver(capability);


                break;
            case "Edge":
                String driverPathEdge = System.getProperty("user.dir")+"/src/Drivers/msedgedriver.exe";
                System.setProperty("webdriver.edge.driver", driverPathEdge);

                EdgeOptions capabilityEdge = new EdgeOptions ();
                capabilityEdge.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                capabilityEdge.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

                driver = new EdgeDriver(capabilityEdge);
                break;

            default:
                System.out.println("Unable to launch a browser");
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://qa-challenge.codesubmit.io");
        return driver;
    }
}



