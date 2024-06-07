package Encapsulation;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setName("Mike");
		System.out.println("Name: "+ p.getName());
		
		p.setAge(20);
		System.out.println("Age: "+ p.getAge());
		
		
		
	}
}
