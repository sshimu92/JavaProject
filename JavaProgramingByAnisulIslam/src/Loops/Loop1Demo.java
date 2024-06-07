package Loops;

import java.util.Scanner;

public class Loop1Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m, n;
		int sum = 0;

		System.out.println("Enter value for m: ");
		m = sc.nextInt();

		System.out.println("Enter value for m: ");
		n = sc.nextInt();

		for (int i = m; i <= n; i++) {

			sum = sum + i;
		}

		System.out.println("The sum is: " + sum);

	}

}

