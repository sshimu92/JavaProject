package Inheritance;

public class Teacher extends Person{

	String qualification;
	
	public void displayInformation2() {
		
		displayInformation1();
		
		System.out.println("Qualification: "+ qualification);
		
	}
	
}
