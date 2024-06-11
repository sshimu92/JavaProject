package BasicsJava;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person1= new Person(); //Object
		
		person1.name= "John";
		person1.age= 35;
		person1.city= "New York";
		person1.gender= "Male";
		person1.eat();
		person1.sleep();
		person1.walk();
		
		System.out.println(person1.name+" "+person1.age+" "+person1.city+" "+person1.gender);
		
		Person person2= new Person();
		person2.name= "Mike";
		person2.age= 45;
		person2.city= "Dallas";
		person2.gender= "Male";
		
		System.out.println(person2.name+" "+person2.age+" "+person2.city+" "+person2.gender);
	}

}
