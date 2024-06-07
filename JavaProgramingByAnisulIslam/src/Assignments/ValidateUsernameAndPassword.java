package Assignments;

import java.util.Scanner;

public class ValidateUsernameAndPassword {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String username= "anis";
		String password= "123456";
		
		System.out.print("Enter Username: ");
		username= sc.next();
		
		System.out.print("Enter Password: ");
		password= sc.next();
		
		while(true) {
			
			if(username.equals(username) && password.equals(password)) {
				
				System.out.println("Welcome to the system");
				break;
			
			}else {
				
				System.out.println("Username/Passwrod is Incorrect.\nPlease try again.\n");
			
				break;
			}
		}

	}

}
