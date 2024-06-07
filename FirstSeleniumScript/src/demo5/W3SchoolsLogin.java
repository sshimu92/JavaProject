package demo5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SchoolsLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\NewChromeDriver\\chromedriver-win64\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://profile.w3schools.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("modalusername")).sendKeys("shawon.shimu@yahoo.com");
		
		driver.findElement(By.xpath("//input[@class='PasswordInput_input_field__EWMIU undefined']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
				
	
	}

}
