package factorial;

import java.util.Scanner;

public class TimesTableDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num;

		System.out.print("Enter any integer: ");
		num= sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(num+ " x "+ i + " = "+ num*i);
	
			
		}
	}
}
