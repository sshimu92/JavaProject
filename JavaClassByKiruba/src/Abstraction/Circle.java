package Abstraction;

public class Circle extends Shape {

	double r;
	double area;

	@Override
	void calculateArea() {

		double r = 5.0;
		area = 3.14 * r * r;

		System.out.println("Area of a Circle: " + area);

	}

}
