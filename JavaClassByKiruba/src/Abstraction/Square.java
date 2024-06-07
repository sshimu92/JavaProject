package Abstraction;

public class Square extends Shape {

	double area;
	double length = 4.0;
	double breadth = 4.0;

	@Override
	void calculateArea() {

		area = length * breadth;

		System.out.println("Area of a Square: " + area);

	}

}
