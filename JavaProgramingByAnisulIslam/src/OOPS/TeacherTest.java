package OOPS;

public class TeacherTest {

	public static void main(String[] args) {
		
		Teacher teacher1 = new Teacher("Anisul", "Male", 35, 710444700);
		//teacher1.setInformation("Anisul", "Male", 35, 710444700);
		teacher1.display();
		
		
		Teacher teacher2 = new Teacher("Mike", "Male", 45, 1234567891);
		//teacher2.setInformation("Mike", "Male", 45, 1234567891);
		teacher2.display();
		
		
		Teacher teacher3 = new Teacher();
		teacher3.display();
		
		
		
//		teacher1.name = "Anisul";
//		teacher1.gender = "Male";
//		teacher1.age = 35;
//		teacher1.phoneNumber = 1710444700;
		
		
		
	}
	
}
