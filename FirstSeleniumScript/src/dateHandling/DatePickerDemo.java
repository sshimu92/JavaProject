package dateHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePickerDemo {

	public static void main(String[] args) throws InterruptedException {
		
		String month = "May 2024";
		String day = "25";
		
        System.setProperty("webdriver.chrome.driver", "C:\\NewChromeDriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe\\");
		
        ChromeOptions options = new ChromeOptions();
        
        options.addArguments("--disable-notifications");
        
		WebDriver driver= new ChromeDriver(options); 
		
		driver.get("https://www.phptravels.net/hotels");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("checkin")).click();
		
		Thread.sleep(2000);
		
		while(true) {
			
			String text = driver.findElement(By.xpath("//th[@class='switch']")).getText();
		
			if(text.equals(month)) {
				
				break;
			
			}else {
				
				driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div[1]/table/thead/tr[1]/th[3]/svg")).click();
			}
		
		}
		
		 driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div[1]/table/tbody/tr[4]/td[7]"));
		
	
		
	}
}
