package demo9;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapitalOne_Automation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shimu\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.capitalone.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("shawonShimu");
		
		driver.findElement(By.xpath("//input[contains(@type, 'password')]")).sendKeys("123456");

		driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
