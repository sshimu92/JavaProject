package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class Setup {

	WebDriver driver;
	 
	@BeforeTest
	 public void openBrowser() {
		 
		 driver.get("https://parabank.parasoft.com/");
	 }
	
}
