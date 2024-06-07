package reportSample;

import org.testng.annotations.Test;

import miniFrameWork.BrowserConfiguration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(ListenersSample.class)
public class SampleTest1 extends ListenersSample {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
		driver = BrowserConfiguration.browserConfiguration();
		
	}
	
	@Test
	public void test() {
		
		driver.get("https://www.mycontactform.com/");
		assert true;
	}
	
	@Test
	public void test1() {
		
		driver.get("https://www.saucedemo.com");
		assert false;
	}

	public WebDriver getDriver() {
		
		return driver;
		
	}
}
