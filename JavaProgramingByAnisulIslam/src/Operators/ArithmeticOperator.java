package Operators;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num1, num2, result;
		
		System.out.println("Enter first number: ");
		num1= sc.nextInt();
		
		System.out.println("Enter second number: ");
		num2= sc.nextInt();
		
		result= num1 + num2;
		
		System.out.println("Sum= "+ result);
		
        result= num1 - num2;
		
		System.out.println("Subtraction= "+ result);
		
        result= num1 * num2;
		
		System.out.println("Multiplication= "+ result);
		
        double result2= (double) num1 / num2;
		
		System.out.println("Division= "+ result2);
		
        result= num1 % num2;
		
		System.out.println("Remainder= "+ result);
		
		
		
		
		
		
		
		
	}

}
