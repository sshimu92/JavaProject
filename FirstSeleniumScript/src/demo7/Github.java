package demo7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\NewChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://github.com/login");

		driver.manage().window().maximize();

		driver.findElement(By.id("login_field")).sendKeys("shawon.shimu@yahoo.com");

		driver.findElement(By.id("password")).sendKeys("password");

		driver.findElement(By.name("commit")).click();

		Thread.sleep(3000);

		driver.close();

	}

}
