package controlStatement;

import java.util.Scanner;

public class IfElseConditionStatement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		System.out.print("Enter any integer: ");

		num = sc.nextInt();

		if (num > 0) {

			System.out.println("Possitive");

		} else if(num<0){

			System.out.println("Negative");
		
		}else {
			
			System.out.println("Null");
		}

	}
}
