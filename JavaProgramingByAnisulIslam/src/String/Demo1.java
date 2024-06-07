package String;

public class Demo1 {

	public static void main(String[] args) {
		

		String firstName= "Shawon";
		String lastName= " Shimu";
		
		//String fullName= firstName + lastName;
		
		String fullName= firstName.concat(lastName);
		
		System.out.println("FullName = "+ fullName);
		
		String upperName= fullName.toUpperCase();
		String lowerName= fullName.toLowerCase();
		
		System.out.println(upperName);
		System.out.println(lowerName);
		
		boolean b= firstName.startsWith("S");
		System.out.println("First Name contains S: "+ b);
		
		boolean a= lastName.endsWith("u");
		System.out.println("Last Name ends with N: "+ a);
		
		String[] names= {"Mike", "John", "Michael"};
		
		for(String x : names) {
			
			System.out.println(x);
		}
		
	}
	
}
