package basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	
	//Static method to return data.
//	public static String[][] getData(){
//		
//		String[][] data = {
//				{"admin","admin123"},
//				{"admin","admin123"},
//		};
//		
//		return data;
	//}
	
	//What is Data Provider? 
	//Data provider is a TstNG annotation used to supply test data to test methods.

	@DataProvider(name= "data")
	public String [][] getData(){
		
		String[][] data = {
				{"admin1","admin123"},
			    {"admin2","admin123"},
			    {"admin3","admin123"},
			    {"admin4","admin123"},
			    {"admin5","admin123"},
		};
		return data;
	}

	@Test(dataProvider= "data")
	public void test(String user, String pass) {
		
		System.out.println(user);
		System.out.println(pass);
		
	}
	
}
