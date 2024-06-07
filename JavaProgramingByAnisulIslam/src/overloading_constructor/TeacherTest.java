package overloading_constructor;

public class TeacherTest {

	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		
		Teacher teacher2 = new Teacher("Anisul", "Male");
		teacher2.displayInformation();
		
		
		Teacher teacher3 = new Teacher("Lisa", 35, "Female");
		teacher3.displayInformation();
		
		
		
		
		
		
	}
}
