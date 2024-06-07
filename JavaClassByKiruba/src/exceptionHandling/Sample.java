package exceptionHandling;

import java.sql.Array;

public class Sample {

	public static void main(String[] args) {

		System.out.println("Hello World");

		int a = 10;
		int b = 0;

		try {
			System.out.println(a / b);

		} catch (ArithmeticException e) {

			// System.out.println(e);
			System.out.println("The value for the b should not be zero");
		}

		System.out.println("Welcome to Java");

		System.out.println("Byee");

	}
}
