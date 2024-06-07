package basics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import miniFrameWork.BrowserConfiguration;

public class DataProviderDemo2 {

	static String[][] data;
    static WebDriver driver;
	
	@DataProvider(name= "testData")
	public static String[][] getData() throws IOException{
		
		 data= DataProviderExample.testData();
		 
		 return data;
		
	}
	@BeforeMethod
	public static void setup() {
		
		driver = BrowserConfiguration.browserConfiguration();
        
		driver.get("https://www.mycontactform.com");
	
	}
	
	@Test(dataProvider = "testData")
	public void test(String user, String pass) {
		
		driver.findElement(By.id("user")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		
	}

	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		System.out.println("Test is Completed");
	}
}
