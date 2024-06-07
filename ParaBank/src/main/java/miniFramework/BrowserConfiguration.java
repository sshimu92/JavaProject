package miniFramework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserConfiguration {
	
	public static WebDriver driver;
	
	public static void browserConfig() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\NewChromeDriver\\chromedriver-win64\\chromedriver.exe\\");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	    WebDriver driver = new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	    driver.quit();
		
	}
	
}
