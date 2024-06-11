package BasicsJava;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1= new Student();
		
		student1.name= "John";
		student1.Id= 1234;
		student1.DOB= 12-24-1996;
		student1.gender= "Male";
		student1.major();
		
		System.out.println(student1.name+ " " +student1.Id+ " " +student1.DOB+ " " +student1.gender);
		
		
		Student student2= new Student();
		
		student2.name= "Deborah";
		student2.Id= 4567;
		student2.DOB= 11-24-1995;
		student2.gender= "Female";
		
		System.out.println(student2.name+ " " +student2.Id+ " " +student2.DOB+ " " +student2.gender);
		
		
		
		

	}

}
