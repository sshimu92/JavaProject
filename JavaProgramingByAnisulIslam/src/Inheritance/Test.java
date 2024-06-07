package Inheritance;

public class Test {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		
		t1.name = "Mike";
		t1.age = 45;
		t1.qualification = "MSc in CSE";
		
		t1.displayInformation2();
		
		System.out.println("  ");
		
        Teacher t2 = new Teacher();
		
		t2.name = "Sam";
		t2.age = 50;
		t2.qualification = "BSc in CSE";
		
		t2.displayInformation2();
		
		
		
	}
	
}
