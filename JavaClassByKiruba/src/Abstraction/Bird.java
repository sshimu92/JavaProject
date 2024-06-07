package Abstraction;

public class Bird {

	String color;
	String size;
	
	public void fly() {
		
		System.out.println("I can fly!");
	}

	public void color() {
		color= "Red";
		
		System.out.println("Color: "+ color);
	}

    public void size() {
		size= "Big";
		
		System.out.println("Size: "+ size);
	}

}
