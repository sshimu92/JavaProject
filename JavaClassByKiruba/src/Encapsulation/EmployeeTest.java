package Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e= new Employee();
		
		e.setName("John");
		e.setAge(45);
		e.setSalary(25000.0);
		
		System.out.println(e.getName("Daniel"));
		System.out.println(e.getAge(45));
		System.out.println(e.getSalary(5000.0));

	}

}
