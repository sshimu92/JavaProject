package loops;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		//Example1: Print 1-10 numbers
		
		int i=1; //initialization
		
		while(i<=10) { //condition
			
			System.out.println(i);
			
			i++; //increment
		}
		//Example2: Print Hello message 10 times.
		System.out.println("*****Print Hello message 10 times*****");
		
	    int j= 1;
		
		while(j<=10) {
			
			System.out.println("Hello World!!!");
			j++;
			
		}
	     //Exmaple3: Print even numbers between 1-10.
		System.out.println("************************");
		
		int k= 1; 
		
		while(k<=10) {
			
			if(k%2==0) {
				
				System.out.println(k +" "+ "Even number");
		
			}else {
				
				System.out.println(k +" "+"Odd number");
			}
			
			k+=2;
		}
	    //example4: Print 10-1
		System.out.println("***Print 10-1 numbers*****");
		
		int n=10;
		
		while(n>0) {
			
			System.out.println(n);
			n--;
		}
	}

	
	
	
}
