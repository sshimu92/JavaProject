package OOPS;

public class Teacher {

	String name;
	String gender;
	int age;
	int phoneNumber;
	
	
	public Teacher() { //Default Constructor
		
		System.out.println("No Value");
		System.out.println(" ");
	}
	
	
	//Constructor: use to initialize object and is not return type also not void type. Constructor method name is same as class name
    //Can be use parameter (Parameterized constructor) and without parameter (Default constructor).
	
	public Teacher(String name, String gender, int age, int phoneNumber) { //Parameterized constructor
		
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phoneNumber = phoneNumber;
		
	}
	
	public void display() {
		
		System.out.println("Name: "+ name);
		System.out.println("Gender: "+ gender);
		System.out.println("Age: "+ age);
		System.out.println("Phone Number: "+ phoneNumber);
		System.out.println();
	}
	
}
