package Assignments;

import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int sum;
		System.out.println("Enter a number: ");
		
		sum= sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			
			 sum= sum+i;
			System.out.println("Sum of 1 to 10: "+sum);
		}

	}

}
