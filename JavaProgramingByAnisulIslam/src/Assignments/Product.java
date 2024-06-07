package Assignments;

import java.util.Scanner;

public class Product {

	int id;
	String title;
	double price;
	String description;
	String category;
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter product id: ");
		
		int id= sc.nextInt();
		
		System.out.println("Enter product title: ");
		
		String title= sc.next();
		
		System.out.println("Enter product price: ");
		
		double price= sc.nextDouble();
		
		System.out.println("Enter product description: ");
		
		String description= sc.next();
		
		System.out.println("Enter product category: ");
		
		String category= sc.nextLine();
		
		

	}

}
