package Abstraction;

public class AbstractTest {

	public static void main(String[] args) {
		
		Animals a;
		
        a= new Cat();
        a.eat();
        a.sound();
        a.sleep();
        
        a= new Dog();
        a.eat();
        a.sound();
        a.sleep();
	}

}
