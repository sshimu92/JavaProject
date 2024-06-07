package dateHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePickerDemo2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\NewChromeDriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe\\");

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.kayak.com/Albany-Hotels.27335.hotel.ksp");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='sR_k-value'][@aria-label='Monday March 4th']")).click();
		
		String month = "May 2024";
		String exp_date = "25";
		
		while(true) {
			
			Thread.sleep(2000);
			
			String text = driver.findElement(By.xpath("//div[@class='wHSr-monthName'][contains(text(),'March 2024')]")).getText();
		
			if(text.equals(month)) {
				
				break;
			
			}else {
				
				driver.findElement(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]/div[1]/div[1]/span[@class='tUEz-icon']/*"));
			}
			
			
		}
		
		
		
		
		
		

	}
}
