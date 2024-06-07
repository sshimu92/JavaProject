package basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Waitss {

	//Synchronized-test scripts are reliably run by managing the timing between the browser  and the test.
	
	@Test
	public void test() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
	    
		options.addArguments("--disable-notifications");
	    
		options.addArguments("--start-maximized");
	    
		WebDriver driver = new ChromeDriver(options);
	    
		driver.get("");
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Soft wait
	    
		driver.manage().window().maximize();
	    
		Thread.sleep(5000); //Hard wait (Highly not recommended)
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(link));
//		link.click();
//		
		
	}
}
