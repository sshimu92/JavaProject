package Assignments;

import java.util.Scanner;

public class Assignment15 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String[] days= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		System.out.println("Please enter number (1-7): ");
		
		int dayNumber= sc.nextInt();
		
		for(int i=0; i<days.length; i++) {
			
			if(dayNumber == i+1)
			
				System.out.println("Weekdays: "+ days[i]);
		
		}
	
		
	}
}
