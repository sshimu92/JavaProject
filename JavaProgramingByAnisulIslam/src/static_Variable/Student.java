package static_Variable;

public class Student {

	static int count = 0;
	
	public Student() {
		
		count++;
	}

	public void totalStudent() {
		
		System.out.println("Total Student: "+count);
		
	}

}
