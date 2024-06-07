package beginnerJava;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num, rev;
		System.out.println("Enter any integer: ");
		
		num= sc.nextInt();
		rev= 1;
		
		while(num != 0) {
			
			rev= rev*10 + num%10;
			num= num/10;
			
			System.out.println("Reverse Number= "+ rev);
		}

	}

}
