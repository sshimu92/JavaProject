package loops;

public class ForLoop {
	
	/*
	 * If you know the number of iterations in advance, the for loop is often the most suitable
	 */

	public static void main(String[] args) {
		
		System.out.println("******Number 1-10******");
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(i);
		}
         
		System.out.println("******Desending order 10-1 Number*******");
		
		for(int i=10; i>0; i--) {
			
			System.out.println(i);
		}
	
		System.out.println("******Odd Number******");
		
		for(int i=1; i<=10; i+=2) {
			
			System.out.println(i);
		}
	 
        System.out.println("*****Even Number*****");
		
		for(int i=2; i<=10; i+=2) {
			
			System.out.println(i);
	}
	
		System.out.println("*****Even and Odd Number*****");
		
		for(int i=1; i<=10; i++) {
			
			if(i%2==0) {
				
				System.out.println("Even Number: "+i);
			
			}else {
				
				System.out.println("Odd Number: "+i);
			}
		}
	}
}
