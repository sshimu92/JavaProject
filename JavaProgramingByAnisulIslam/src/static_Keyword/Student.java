package static_Keyword;

public class Student {

	String name;
	int id;
	static String universityName = "OSU";
	
	
	public Student(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	
	public void displayInformation() {
		
		System.out.println("Name: "+ name);
		System.out.println("Id: "+ id);
		System.out.println("University Name: "+ universityName);
		
		System.out.println(" ");
		
	}
}
