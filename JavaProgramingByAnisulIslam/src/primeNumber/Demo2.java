package primeNumber;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		int count = 0;

		System.out.print("Enter any possitive integer: ");
		num = sc.nextInt();

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				count++;

				break;
			}
		}

		if (num == 0 || num == 1) {

			System.out.println("Not a prime number");

		} else {

			for (int i = 2; i < num; i++) {

				if (num % i == 0) {

					count++;

					break;
				}
			}
			if (count == 0) {

				System.out.println("Prime Number");

			} else {

				System.out.println("Not a prime number");
			}

		}
	}
}
