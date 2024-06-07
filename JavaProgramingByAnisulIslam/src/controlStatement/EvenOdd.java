package controlStatement;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("Enter any possitive integer:");

		num = sc.nextInt();

		if (num % 2 == 0) {

			System.out.println("Even Number");

		} else {

			System.out.println("Odd");
		}
	}

}
