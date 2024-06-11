package practice;

public class StudentTest {

	public static void main(String args[]){  
		//creating objects  
		Student s1=new Student();  
		Student s2=new Student();  
		
		s1.id = 1235;
		s1.name = "Mike";
		
		System.out.println("Student one: ");
        s1.display(); 
		
	
		
		//displaying values of the object  
		s2.id = 4645153;
		s2.name = "Don";
		System.out.println("Student two: ");
		s2.display();  
	
	}  

	
}
