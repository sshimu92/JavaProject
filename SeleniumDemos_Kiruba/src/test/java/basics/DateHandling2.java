package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DateHandling2 {

public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\NewChromeDriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe\\");
		
        ChromeOptions options = new ChromeOptions();
        
        options.addArguments("--disable-notifications");
        
		WebDriver driver= new ChromeDriver(options); 
		
		driver.get("https://www.easemytrip.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ddate")).click();
		
		String targetMonth = "MAY";
		
		while(true) {
			 
			Thread.sleep(1000);
			
		    driver.findElement(By.id("img2Nex")).click();
			
			WebElement month = driver.findElement(By.className("month2"));
			
			String currentMonth = month.getText().split(" ")[0].toUpperCase();
			
			   
			
				if(currentMonth.equals(targetMonth)) {
					
					break;
				}
			
			} 
			
		      List<WebElement> dates = driver.findElements(By.xpath("//div[@class='box']"));
		      
		      for(WebElement date : dates) {
		    	  
		    	  if(date.getText().equals("25")) {
		    		  
		    		  date.click();
		    		  
		    		  break;
		    	  }
		      }
				
		      //driver.quit();
			}
			
			
		}
		
		
		