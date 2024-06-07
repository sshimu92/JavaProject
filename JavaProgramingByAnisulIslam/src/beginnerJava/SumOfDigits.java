package beginnerJava;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num;
		int remainder;
		int sum= 0;
		
		System.out.print("Enter any numbers: ");
		num= sc.nextInt();
		
	
		
		while(num != 0) {
			
			remainder= num % 10;
			sum= sum + remainder;
			num= num / 10;
			
		}
		
		System.out.println("Sum of digits: "+ sum);
		

	}

}
