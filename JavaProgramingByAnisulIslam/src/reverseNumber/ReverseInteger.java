package reverseNumber;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num, remainder;
		int sum = 0;

		System.out.print("Enter any number: ");
		num = sc.nextInt();


		while (num != 0) {

			remainder = num % 10;
			sum = sum * 10 + remainder;
			num = num / 10;

		}

		System.out.println("Reverse Number: " + sum);
	}

}
