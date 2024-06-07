package youtubeSeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		
       WebDriver driver= Base.getDriver();
       
       driver.get("https://profile.creatio.com/");
       
       WebElement email_field=driver.findElement(By.id("edit-name"));
       email_field.sendKeys("Admin");
       
       WebElement password_field=driver.findElement(By.xpath("//input[@type='password']"));
       password_field.sendKeys("1234");
       
       WebElement login_button=driver.findElement(By.id("edit-submit"));
       login_button.click();
       
       WebElement Register_button=driver.findElement(By.id("edit-submit"));
       
       String Register_button_text= Register_button.getText();
       
       System.out.println(Register_button_text);
      
       Thread.sleep(2000);
        
       driver.close();
       
      
       
       
		
	
	
	}

}
