package Base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilities.PropertyFileReader;

public class DriverSetup {

	private static WebDriver driver;

	//invoke chrome browser
	public static WebDriver invokeBrowser()  {

		    System.setProperty("webdriver.chrome.driver", "C:\\NewChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
			
		    ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--start-maximized");
			 
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			 
			return driver;
	}
}
