package exceptionHandling;

public class ExceptionHandling1 {

	//Exception: is an unwanted event that interrupts the normal flow in program.
	
	public static void main(String[] args) {

		try {
			int myInt = Integer.parseInt("Pants");

		} catch (NumberFormatException e) {

			System.out.println("Hey dude, you cannot make an int out of that. Stop trying to make that happen");

		} finally {

			System.out.println("In the finally block");
		}

		System.out.println("End here");
	}

}
