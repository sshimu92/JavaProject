package Abstraction;

public class RectangleArea implements Rectangle{

	@Override
	public void cal(int a, int b) { //implementation
		
		int area= a*b;
		System.out.println("Area of Rectaangle: "+ area);
		
	}

}
