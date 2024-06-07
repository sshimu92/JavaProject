package beginnerJava;

import java.util.Scanner;

public class TriangleDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double base, height,area;

		System.out.print("Enter base: ");

		base = sc.nextDouble();

		System.out.print("Enter height: ");

		height = sc.nextDouble();
		
		area= 0.5 * base * height;
		
		System.out.println("Area of a triangle: "+ area);

	}

}
