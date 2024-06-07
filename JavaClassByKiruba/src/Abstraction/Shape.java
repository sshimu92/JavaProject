package Abstraction;

public abstract class Shape {

	abstract void calculateArea();

	public void setColor(String color) {

		System.out.println("Color: " + color);
	}
}
