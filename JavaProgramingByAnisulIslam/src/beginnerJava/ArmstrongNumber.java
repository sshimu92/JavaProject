package beginnerJava;

import java.util.Scanner;

public class ArmstrongNumber {

public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num, temp;
		int remainder;
		int sum= 0;
		
		System.out.print("Enter any number: ");
		num= sc.nextInt();
		
		temp= num;
		
		while(temp != 0) {
			
			remainder= temp % 10;
			sum= sum + remainder * remainder * remainder;
			temp= temp / 10;
			
		}
		if(num == sum) {
			
			System.out.println("Armstrong Number");
		
		}else {
			
			System.out.println("Not Armstrong Number");
		}
		

	}
}