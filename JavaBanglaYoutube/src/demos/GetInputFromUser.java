package demos;

import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		
		int num1=scanner.nextInt();
		
		System.out.println("You have entered number: "+num1);
        
        System.out.println("Enter second number: ");
        
        int num2= scanner.nextInt();
        
        System.out.println("You have Entered: "+ (num1+num2));
        
        System.out.println("Enter third number: ");
        
        int num3= scanner.nextInt();
        
        System.out.println("You have entered: "+ (num1+num2+num3));
        
        
        
        
		
		
		
		
		

	}

}
