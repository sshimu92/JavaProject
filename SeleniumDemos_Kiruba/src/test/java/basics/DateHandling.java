package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DateHandling {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\NewChromeDriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe\\");
		
        ChromeOptions options = new ChromeOptions();
        
        options.addArguments("--disable-notifications");
        
		WebDriver driver= new ChromeDriver(options); 
		
		driver.get("https://www.easemytrip.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='ddate']")).click();
		
		WebElement month = driver.findElement(By.className("month2"));
		
		String mon = month.getText();
		
		System.out.println(mon);
		
		String[] arr = mon.split("");
		
		String targetMonth = "MAY";
		
		while(!arr[0].toUpperCase().equals(targetMonth)) {
			     
			    Thread.sleep(1000);
			
				driver.findElement(By.id("img2Nex")).click();
				
				month = driver.findElement(By.className("month2"));
				
				mon =month.getText();
				
				System.out.println(mon);
				
				arr = mon.split(" ");
				
				if(arr[0].toUpperCase().equals(targetMonth)) {
					
					break;
				}
				
			} 
			
		      WebElement exp_date = driver.findElement(By.xpath("//li[@id='frth_6_25/05/2024']//span[@id='25/05/2024']"));
		       
		      exp_date.click();
		      
		      System.out.println(exp_date.getText());
		      
//		      List<WebElement> list = driver.findElements(By.xpath("//li[@id='frth_6_25/05/2024']//span[@id='25/05/2024']"));
//		      
//		      for(WebElement element : list) {
//		    	  
//		    	  if(element.getText().equals("25")) {
//		    		  
//		    		  element.click();
//		    		  
//		    		  break;
//		    	  }
//		      }
				
		      //driver.quit();
		      
			}
			
			
		}
		
		
		
		
		
		
	

