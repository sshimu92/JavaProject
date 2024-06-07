package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\NewChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://gmail.com");

		driver.manage().window().maximize();

		driver.findElement(By.name(".//*[@id='next']")).click();

		Thread.sleep(2000);

		@SuppressWarnings("unused")
		String actual_error = driver.findElement(By.xpath(".//*@id='errormsg_0_Email']")).getText();

	}

}


