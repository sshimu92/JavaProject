package loops;

public class DoWHileLoop {

	public static void main(String[] args) {

		int i = 1;

		do {

			System.out.println(i); // i values: 1 2 3 4...10
			i++; // i value becomes: 2 3 4....11

		} while (i<=10);

		System.out.println("*************");

		int j = 10;

		do {
			System.out.println(j);
			j--;

		} while (j>0);
		
		System.out.println("*************");
		
		int n= 2;
		
		do {
			System.out.println(n);
			n+=2;
		
		}while(n<=10);
		
		System.out.println("*************");
		
		int m= 1;
		
		do {
			System.out.println(m);
			m+=2;
		
		}while(m<=10);
	} 
	
}

	
	

