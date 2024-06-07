package Assignments;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char ch;
		System.out.println("Enter any letter: ");

		ch = sc.next().charAt(0);

		if (ch == 'y' || ch == 'n') {

			System.out.println("You are a java lover");

		} else if (ch == 'Y' || ch == 'N') {

			System.out.println("You are not a java lover");

		} else {

			System.out.println("Neither");
		}

	}

}
