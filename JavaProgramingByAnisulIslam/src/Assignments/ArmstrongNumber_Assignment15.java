package Assignments;

import java.util.Scanner;

public class ArmstrongNumber_Assignment15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m, n, r, temp;
		int sum = 0;
		int totalArmstrongNumber = 0;

		System.out.print("Enter Initial Number: ");
		m = sc.nextInt();

		System.out.print("Enter Final Number: ");
		n = sc.nextInt();

		for (int i = m; i <= n; i++) {

			temp = i;

			while (temp != 0) {

				r = temp % 10;
				sum = sum + r * r * r;
				temp = temp / 10;

			}

			if (sum == i) {

				System.out.println(i);
				totalArmstrongNumber++;

			}

		}

		System.out.println("Total Armstrong Number: "+ totalArmstrongNumber);
	}

}
