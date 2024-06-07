package HomeWork;

import java.util.Scanner;

public class Calculation3 {
	
	public int sum(int sub1, int sub2, int sub3, int sub4, int sub5 ) {
		int sum= (sub1+sub2+sub3+sub4+sub5);
		return sum;
	}
      public int average(int sum) {
		 int average= sum/5;
		 return average;																															
      }	
    
      public static void main(String[] args) {
		
		Calculation3 c= new Calculation3();
		
		Scanner s= new Scanner(System.in);
		
        System.out.println("Enter sub1: ");		
		int sub1= s.nextInt();
		
        System.out.println("Enter sub2: ");
        int sub2= s.nextInt();
        
        System.out.println("Enter sub3: ");		
		int sub3= s.nextInt();
		
		System.out.println("Enter sub4: ");		
		int sub4= s.nextInt();
		
		System.out.println("Enter sub5: ");		
		int sub5= s.nextInt();
		
		System.out.println("Sum: "+ c.sum(sub1, sub2, sub3, sub4, sub5));
		System.out.println("Average: "+ c.average(c.sum(sub1, sub2, sub3, sub4, sub5)));
		
		
		
		
		
		
		
		
		
		
		
	}

}
