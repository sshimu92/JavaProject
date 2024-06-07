package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	public WebDriver init_driver(String browser) {
		
		System.out.println("Browser Value Is: "+browser);
		
		if(browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
	
		else if(browser.equals("firefox")) {
			
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new FirefoxDriver());
			
		}
	
       else if(browser.equals("safari")) {
			
			tlDriver.set(new FirefoxDriver());
	}
       else {
    	   
    	   System.out.println("Please pass the correct browser value: "+ browser);
       }
    
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
		
	}
	
	private WebDriver getDriver() {
		
		return tlDriver.get();
	}

}
