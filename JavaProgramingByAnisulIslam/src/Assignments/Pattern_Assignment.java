package Assignments;

import java.util.Scanner;

public class Pattern_Assignment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter line numbers: ");
		int n = sc.nextInt();

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= row; col++) {

				System.out.print(col % 2 + " ");
			}

			System.out.println();
		}

	}

}
