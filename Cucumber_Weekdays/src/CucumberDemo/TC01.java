package CucumberDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC01 
{
	static WebDriver driver;
	@Given("Environment Setting")
	public void EnvironmentSetup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
    @When("enter username and password")
   public void enterDetails()
    {
    	driver.findElement(By.xpath(".//input[@name='email']")).sendKeys("anshul8307@gmail.com");
		driver.findElement(By.xpath(".//input[@name='pass']")).sendKeys("cts-2016");
    }
    
    @Then("User redirected to homepage")
   public void Redirect()
    {
    	driver.findElement(By.xpath(".//input[@data-testid='royal_login_button']")).click();
    }
    
}
