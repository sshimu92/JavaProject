package Inheritance;

public class InheritaceTest {

	public static void main(String[] args) {
		
		Doctor doc= new Doctor("Mike");
		Singer singer= new Singer("Shakira");
		Teacher teacher= new Teacher("Daniel");
		
		doc.howToLooseWeight();
		singer.singAsong();
		teacher.giveUsAlesson();
		
		doc.eat();
		doc.sleep();
		doc.swim();
		
		singer.eat();
		singer.sleep();
		singer.swim();
		
		teacher.eat();
		teacher.sleep();
		teacher.swim();
		
		

	}

}
