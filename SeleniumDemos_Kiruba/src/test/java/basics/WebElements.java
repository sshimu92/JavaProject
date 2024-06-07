package basics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElements {

	@Test
	public void Setup(){
		
		ChromeOptions options= new ChromeOptions();
		
		options.addArguments("start-maximized");
		
		WebDriver driver= new ChromeDriver(); 
		
		driver.get("https://www.mycontactform.com");
		
		driver.manage().window().maximize();
		
		//Locating elements
		//name, id, className, xpath, linkText, partialLinkText, cssSelector, tagName.
		
		
		WebElement username= driver.findElement(By.id("user"));
		username.sendKeys("Admin");
		
		driver.findElement(By.id("pass")).sendKeys("12345");
		
		driver.findElement(By.linkText("Sample Forms")).click();
		
		driver.close();
		
	}
	
}
