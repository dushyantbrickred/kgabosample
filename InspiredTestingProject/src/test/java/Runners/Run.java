package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/main/resources/webSolution.feature",
        glue = {"stepDefinitions"},
        monochrome=true
)

public class Run extends AbstractTestNGCucumberTests {


}
