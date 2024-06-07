package beginnerJava;

public class IncrementDecrementDemo {

	public static void main(String[] args) {

		int x = 25;
		int y;

		y = x++; // Post-increment and Post-decrement.
		System.out.println("y= " + y); //25

		y = x;
		System.out.println("y= " + y); //26
		
		y = x--;
		System.out.println("y= " + y); //25

		
		
		System.out.println("*****Post increment****");

		
		y = ++x; // Pre-increment and Pre-decrement.
		System.out.println("y= " + y); //26

		
		y = --x; // 24
		System.out.println("y= " + y); //24

		

	}

}
