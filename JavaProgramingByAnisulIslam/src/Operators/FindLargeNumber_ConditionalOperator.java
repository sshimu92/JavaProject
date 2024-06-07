package Operators;

import java.util.Scanner;

public class FindLargeNumber_ConditionalOperator { 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2, large;
		System.out.println("Enter two numbers: ");

		num1 = sc.nextInt();
		num2 = sc.nextInt();

		large = (num1 > num2) ? num1 : num2;

		System.out.println("Large Number: " + large);

	}

}
