package basics;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {

	@Test
	public void Setup() {
		//To open Chrome Browser.
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//using navigate method
		driver.navigate().to("https://www.saucedemo.com");
		
		//Navigational methods in selenium
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//To close the browser.
		driver.close(); //close all instance
		
		//Webdriver methods
	     String title= driver.getTitle();
	     System.out.println("Title of the page is"+ title);
	     
	     String url= driver.getCurrentUrl();
	     System.out.println("URL of the page is"+ url);
	     
	     
		
	}
	
}
