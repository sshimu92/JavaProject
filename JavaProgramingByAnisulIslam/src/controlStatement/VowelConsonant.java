package controlStatement;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char ch;
		System.out.println("Enter any letter: ");

		ch = sc.next().charAt(0);

		if (ch == 'a') {

			System.out.println("Vowel");

		} else if (ch == 'e') {

			System.out.println("Vowel");

		} else if (ch == 'i') {

			System.out.println("Vowel");

		} else if (ch == 'o') {

			System.out.println("Vowel");

		} else if (ch == 'u') {

			System.out.println("Vowel");

		} else {

			System.out.println("Consonant");
		}
	}

}
