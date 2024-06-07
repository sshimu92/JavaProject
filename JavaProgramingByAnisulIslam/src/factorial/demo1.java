package factorial;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num;
		int fact= 1;
		
		System.out.print("Enter any possitive integer: ");
		
		num= sc.nextInt();
		
		for(int i=num; i>=1; i--) {
				
			fact= fact * i;
			
		}

		System.out.println("Factorial= "+ fact);
	}

}
