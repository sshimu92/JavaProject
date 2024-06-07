package PolyMorphism;

public class GeometryCalculator {

	
	public double calculateArea(double width, double length) {
		
		double areaOfRectangle= width*length;
		
		return areaOfRectangle;
		
	}
	
    public double calculateArea(int width, int length) {
		
		int areaOfCircle= width*length;
		
		return areaOfCircle;
		
	}

    public double calculateArea(int width, double length) {
	
	
	double areaOfTriangle= width*length;
	
	return areaOfTriangle;
	
}
	public static void main(String[] args) {
		
		GeometryCalculator gc= new GeometryCalculator();
		
		 System.out.println("Area of Rectangle: "+ gc.calculateArea(10.0, 12.5));
		 
		 System.out.println("Area of Circles: "+ gc.calculateArea(5, 10));
		 
		 System.out.println("Area of Triangle: "+ gc.calculateArea(10, 15.5));
		
	}
	
	
	
	
	
	
	
	

}
