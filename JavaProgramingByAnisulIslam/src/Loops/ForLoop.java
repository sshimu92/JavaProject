package Loops;

public class ForLoop {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(i +":" + "Bangladesh");
		}

		System.out.println("Even numbers: ");
		
		for(int i=2; i<=100; i+=2) {
			
			System.out.println(i);
		}
	
		System.out.println("***Upside-down****");
		
		for(int i=5; i>=0; i--) {
			
			System.out.println(i);
		}
	}

}
