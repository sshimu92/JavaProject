package demo3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginNetflix{

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\NewChromeDriver\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.netflix.com/Login");

		driver.manage().window().maximize();

		driver.findElement(By.id("id_userLoginId")).sendKeys("shawon.shimu@yahoo.com");

		driver.findElement(By.name("password")).sendKeys("1234");

		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Remember me')]")).click();
	}

}
