package Operators;

import java.util.Scanner;

public class VowelConsonantDemo {

	public static void main(String[] args) {

		// Logical || operator.
		Scanner sc = new Scanner(System.in);
		char ch;

		System.out.println("Enter any letter: ");

		ch = sc.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

			System.out.println("Vowel");

		} else {

			System.out.println("Consonant");
		}

	}

}
