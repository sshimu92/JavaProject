package Assignments;

import java.util.Scanner;

public class Assignment9_CallCenter {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int language;
		System.out.println("Enter any integer: ");
		
		language= sc.nextInt();
		
		switch(language) {
		
		case 1:
			System.out.println("Hindi");
			break;
		
		case 2: 
			System.out.println("Bengali");
			break;
		
		case 3: 
			System.out.println("Urdu");
			break;
			
		default:
			System.out.println("English");
		}

	}

}
