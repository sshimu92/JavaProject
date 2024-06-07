package Assignments;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		char ms,eng;
		System.out.println("Have you completed masters?(y/n): ");
		
		ms= sc.next().charAt(0);
		
        System.out.println("Are you fluent in English?(y/n): ");
        
        eng= sc.next().charAt(0);
		
		if(ms=='y' && eng=='y') {
			
			System.out.println("Congratualtion!!! You are eligible for the job interview");
		
		}else if(ms=='n' && eng=='n') {
			
			System.out.println("Sorry you are not eligible for the job interview");
		
		}else if(ms=='y' && eng=='n') {
			
			System.out.println("Not qualified for the interview");
		
		}else if(ms=='n' && eng=='y') {
			
			System.out.println("Not qualified for the interview");
		
		}else {
			
			System.out.println("Invalid");
		}

	}

}
