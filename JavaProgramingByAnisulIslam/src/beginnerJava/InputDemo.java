package beginnerJava;

import java.util.Scanner;

public class InputDemo {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter any number");
		
		int num= sc.nextInt();
		
		System.out.println("Number: "+ num);
		
		System.out.print("Enter your name:");
		
		String name= sc.next();
		
		System.out.println("Name: "+ name);
		
		System.out.print("Enter your gender");
		
		String g= sc.next();
		
		System.out.println("Gender: "+ g);
		
		
		
		

	}

}
