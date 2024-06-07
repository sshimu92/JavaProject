package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {

	public WebDriver driver;
	public LoginPage loginPg;
	
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
	    
	    System.setProperty("webdriver.chrome.driver", "C:\\NewChromeDriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe\\");
		
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("--dissable-notificatins");
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
//		WebDriverManager.chromedriver().setup();
//		
//		driver = new ChromeDriver();
//		
//		loginPg = new LoginPage(driver);
		
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	    
		driver.get(url);
		
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailAddress, String password) {
	   
		loginPg.enterEmailAddress(emailAddress);
		loginPg.enterPassword(password);
	}

	@When("Click on Login")
	public void click_on_login() {
	   
		loginPg.clickOnLoginButton();
	}

	@Then("Page Title Should be {string}")
	public void page_title_should_be(String expectedTitle) {
	 
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			
			Assert.assertTrue(true); //pass
		
		}else {
			
			Assert.assertTrue(false); //fail
		}
		
	}

	@When("User click on Logout Link")
	public void user_click_on_logout_link() {
	    
		loginPg.clickOnLogOutButton();
	}

	@Then("close browser")
	public void close_browser() {
	  
		driver.close();
		driver.quit();
	}



}
