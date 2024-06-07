package Operators;

import java.util.Scanner;

public class CapitalSmallLetter {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		//Logical && operator
		char ch;
		System.out.println("Enter ay letter: ");
		
		ch= sc.next().charAt(0);
		
		if(ch>='a' && ch<='z') { //a-z
			
			System.out.println("Small Letter");
		
		}else if(ch>='A' && ch<='Z') {
			
			System.out.println("Capital Letter");
		
		}else {
			
			System.out.println("Not a letter");
		}

	}

}
