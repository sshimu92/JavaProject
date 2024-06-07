package extendReportExample;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import miniFrameWork.BrowserConfiguration;
import reportSample.ListenersSample;

@Listeners(ExtendTestNGReportListener.class)
public class SampleTest extends ExtendTestNGReportListener{
	
    WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
		driver = BrowserConfiguration.browserConfiguration();
		
	}
	
	@Test
	public void testMethod1() {
		
		driver.get("https://www.mycontactform.com/");
		assert true;
	}
	
	@Test
	public void testMethod2() {
		
		driver.get("https://www.saucedemo.com");
		assert false;
	}

	public WebDriver getDriver() {
		
		return driver;
		
	}
}
