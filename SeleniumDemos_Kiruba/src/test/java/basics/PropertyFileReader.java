package basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	public static String getPropertyValue(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\shimu\\eclipse-workspace\\SeleniumDemos_Kiruba\\src\\test\\java\\resources\\configuration.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		return prop.getProperty(key);
		
	}
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(getPropertyValue("browserName"));
		
		System.out.println(getPropertyValue("userName"));
		
		System.out.println(getPropertyValue("password"));
		
		
	}
	
}
