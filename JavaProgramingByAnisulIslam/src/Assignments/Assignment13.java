package Assignments;

import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num;
		int firstNumber= 0;
		int secondNumber= 1;
		int fibo;
		
		System.out.print("Which fibonacci number you want to see? : ");
		num= sc.nextInt();
		
		System.out.print(firstNumber +" "+ secondNumber);
		
		for(int i=3; i<=num; i++) {
			
			fibo= firstNumber + secondNumber;
			
			System.out.print(" "+ fibo);

			firstNumber= secondNumber;
			secondNumber= fibo;
		}
		
		
		
	}

}
