package fibonacciSeries;

import java.util.Scanner;

public class Demo {

	// Fibonacci Number: 0 + 1= 1, 1+2= 3, 2+3 =5, 3+5= 8, 5+8= 13
	//Default number: 0 and 1.
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		int firstNumber = 0;
		int secondNumber = 1;
		int fibo;

		System.out.print("Home many numbers: ");
		num = sc.nextInt();

		System.out.print(firstNumber + " " + secondNumber);

		for (int i = 3; i <= num; i++) {

			fibo = firstNumber + secondNumber;

			System.out.print(" " + fibo);

			firstNumber = secondNumber;
			secondNumber = fibo;

		}
	}
}
