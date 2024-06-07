package PracticeQuestionsGivenByKiruba;

public class Employee {

	public String name;
	public int age;
	public double salary;
	
	public Employee(String name, int age, double salary) {
		
		this.name= name;
		this.age= age;
		this.salary= salary;
		
	}
	
	public void displayDetails() {
		
		System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println();
		
		
	}
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("John Doe", 30, 50000.0);
        Employee employee2 = new Employee("Jane Smith", 25, 60000.0);
        Employee employee3 = new Employee("Bob Johnson", 35, 75000.0);
		
        employee1.displayDetails();
        employee2.displayDetails();
        employee3.displayDetails();
	
		
		
		
		
	}
	
}
