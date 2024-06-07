package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import miniFrameWork.BrowserConfiguration;

public class Setup {

   public WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		//System.out.println("Opening Browser");
		
		driver = BrowserConfiguration.browserConfiguration();
		
		driver.get("https://www.mycontactform.com");
		
	}


	@AfterTest    //@AfterMethod, @AfterClass
	public void tearDown() { //Will execute only once after all the test cases.
		
		System.out.println("Closing Browser");
		
		driver.quit();
	}
}
