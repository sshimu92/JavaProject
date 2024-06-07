package typesOfVariable;

public class VariableTypes {

	String name; //instance variable type
	int id;
	
	static String universityName = "OSU"; //static variable type
	
	public  VariableTypes(String name, int id) {
		
		this.name = name;
		this.id = id;      //Within the method body called this (Local Variable type)
		
	}
	
	public void display() {
		
		System.out.println("Name: "+ name); //Static variable type
		System.out.println("Id: "+ id);
		System.out.println("University Name: "+ universityName);
	}
}
