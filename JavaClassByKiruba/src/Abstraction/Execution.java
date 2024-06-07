package Abstraction;

public class Execution {

	public static void main(String[] args) {
		
		Rectangle r; // creating an interface reference.
		
		r= new RectangleArea();
		r.cal(10, 20);
		
		r= new RectanglePerimeter();
		r.cal(10, 20);
	}
}
