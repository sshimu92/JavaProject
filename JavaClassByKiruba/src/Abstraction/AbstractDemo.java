package Abstraction;

public class AbstractDemo {

	public static void main(String[] args) {

		Shape s;

		s = new Circle();
		s.calculateArea();
		s.setColor("Green");

		s = new Square();
		s.calculateArea();
		s.setColor("Yellow");

	}

}
