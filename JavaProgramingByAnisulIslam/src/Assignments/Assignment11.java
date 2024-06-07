package Assignments;

import java.util.Scanner;

public class Assignment11 {

	public static void main(String[] args) {
		
		//Find factorial of n.
		
		Scanner sc= new Scanner(System.in);
		
		int n;
		int factorial=1;
		
		System.out.println("Enter a number: ");
		
		n= sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			factorial= factorial * i;
			
			System.out.println("Factorial of n= "+ factorial);
		}

	}

}
