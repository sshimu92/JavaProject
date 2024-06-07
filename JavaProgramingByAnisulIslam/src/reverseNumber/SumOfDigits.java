package reverseNumber;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num;
		int remainder;
		int temporary;
		int sum= 0;
		
		System.out.print("Enter any numbers: ");
		num= sc.nextInt();
		
		temporary= num;
		
		while(temporary != 0) {
			
			remainder= temporary % 10;
			sum= sum + remainder;
			temporary= temporary / 10;
			
		}
		
		System.out.println("Sum of digits: "+ sum);
		

	}

}
