package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoIframe {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\NewChromeDriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe\\");
		
		WebDriver driver= new ChromeDriver(); 
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.id("iframe"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//button[contains(@onclick,'myFunction()')]")).click();
		
		driver.switchTo().parentFrame();
		
		System.out.println(driver.getTitle());
		
		
		
	}
}
