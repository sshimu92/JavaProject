package Assignments;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int age;
		System.out.println("Enter your age:");
		
		age= sc.nextInt();
		
		if(age>=18) {
			
			System.out.println("Valid Voter");
		
		}else {
			
			System.out.println("Not Eligible");
		}

	}

}
