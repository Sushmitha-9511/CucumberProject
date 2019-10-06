package StepDefinition_package_google;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class google_StepDefinition {

	WebDriver driver;
	@Given("^User is on the Google page$")
	public void goToGoogle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sushmitha\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@When("^Page loads properly$")
	public void waitForPage()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
	}
	@Then("^User will search name in  the search box$")
	public void searchElement(DataTable datavalues)

	{
		List<Map<String,String>> list=datavalues.asMaps(String.class, String.class);
		for(Map<String,String> data :list)
		{
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys(data.get("name"));
		
		}
		
	}
	@Given("^User is on facebook.com$")
	public void openFacebook()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sushmitha\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
}
