package BasicsJava;

public class Looping {

	public static void main(String[] args) {
		
		/*loop will execute until the condition become false based on the data we are providing.
		 * Iteration means kind of repeating but different results.
		 * Loops: for loop, while, and do while.
		 * While: entry-controlled
		 * do while: exit-controlled 
		 * for loop: entry-controlled
		 * Loops are also known as iterating statements.
		 * we don't have to write code again n again
		 * time saving
		 * Initialization expression
		 * Test expression (boolean expression)
		 * Body of the loop 
		 * update expression
		 */
		
		
	//While Loop.
		
		int i= 1;
		System.out.println("=======While Loop=======");
		
		while(i<4) {
			
			System.out.println(i);
			i++;
		
			
	//do while 
		int j=6;
		System.out.println("======do while loop=======");
		
		do {
			System.out.println(j);
			i++;
			
		} while(j<5);
		
		
	//for loop
		System.out.println("=======for loop======");
		
		for(int x=0; x<5; x++) {
			System.out.println(x);
		}
		
		}
		
	   

	}
	
}


