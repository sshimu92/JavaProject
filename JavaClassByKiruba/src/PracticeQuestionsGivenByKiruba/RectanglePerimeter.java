package PracticeQuestionsGivenByKiruba;

import java.util.Scanner;

public class RectanglePerimeter {

	
	public double perimeterCalculator(double length, double breadth) {
		    
		  return 2 * (length + breadth);
		
	}
    
	public void getValues() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter length and breadth of the rectangle:");
		
		double length= sc.nextDouble();
		double breadth= sc.nextDouble();
		
		double perimeter= perimeterCalculator(length, breadth);
		
		System.out.println("Perimeter of the rectangle: "+ perimeter);
				
	}
     public static void main(String[] args) {
    	 
    	 RectanglePerimeter rectanglePerimeter= new RectanglePerimeter();
    	 
    	 rectanglePerimeter.getValues();
     }

}
