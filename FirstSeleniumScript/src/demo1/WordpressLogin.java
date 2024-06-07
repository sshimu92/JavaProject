package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WordpressLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\NewChromeDriver\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://login.wordpress.org/");

		driver.findElement(By.id("user_login")).sendKeys("Admin");

		driver.findElement(By.id("user_pass")).sendKeys("123");

		driver.findElement(By.name("wp-submit")).click();

		driver.quit();

	}

}
