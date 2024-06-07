package ObjectOrientedProgramming;

import java.util.ArrayList;

public class Student_Test {

	public static void main(String[] args) {
		
		Student myStudent= new Student();
		
		ArrayList<String> name= new ArrayList<String>();
		name.add("Mike");
		name.add("John");
		name.add("Sandy");
		name.add("Deborah");
		name.add("Smith");
		
		System.out.println(name.get(3));
		
		
		myStudent.student1();
		myStudent.student2();

	}

}
