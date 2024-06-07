package Abstraction;

public abstract class Calculator {

	//Abstract class: The class which have at least one abstract method is called abstract class.
	//Abstract method: its is a method without body.
	
	//Abstract method (without body)
	abstract void display();
	
	//Concrete method.
	public void add(int a, int b) {
		
		System.out.println(a+b);
	}

}
