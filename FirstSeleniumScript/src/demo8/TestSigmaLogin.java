package demo8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSigmaLogin {

	public static void main(String[] agrs) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\NewChromeDriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/");
		
		driver.findElement(By.xpath("//button[@ng-click='customer()']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("userSelect")).isSelected();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}


}
