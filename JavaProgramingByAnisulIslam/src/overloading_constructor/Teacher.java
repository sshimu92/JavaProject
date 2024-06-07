package overloading_constructor;

public class Teacher {

	String name;
	String gender;
	int age;
	
	public Teacher() {
		
		System.out.println("No Information");
		System.out.println(" ");
	}

	public Teacher(String name, String gender) {
		
		this.name= name;
		this.gender= gender;
		
		
	}

    public Teacher(String name, int age, String gender) {
		
		this.name= name;
		this.age= age;
		this.gender = gender;
		
	}

    public void displayInformation() {
    	
    	System.out.println("Name: "+ name);
    	System.out.println("Gender: "+ gender);
    	System.out.println("Age: "+ age);
    	
    	System.out.println(" ");
    }
}
