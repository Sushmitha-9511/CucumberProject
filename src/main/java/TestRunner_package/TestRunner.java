package TestRunner_package;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;
@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\Sushmitha\\eclipse-workspace\\CucumberFrameworkPractise\\src\\main\\java\\Feature_Package\\google.feature"
,glue= {"StepDefinition_package_google"}
,plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:output/report.html"}
, monochrome=true,
tags= {"@RegressionTest,@SmokeTest"}
)
public class TestRunner {
	@AfterClass
    public static void setup() {
     
	Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
    Reporter.setSystemInfo("user", System.getProperty("user.name"));
    Reporter.setSystemInfo("os", "Windows");
    Reporter.setTestRunnerOutput("Sample test runner output message");
	
	}

}
