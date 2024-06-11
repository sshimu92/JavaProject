package BasicsJava;

public class LoopingExercise1 {

	public static void main(String[] args) {

		// Odd Number
		int j = 1;

		while (j < 10) {

			System.out.println(j);

			j += 2;

			// Even Number

			for (int i = 2; i < 10; i += 2) {

				if (i % 2 == 0) {
					continue;
				}
				
				   System.out.println(i);

				// int i=10 sum upto 10

				int sum = 0;

				for (int x = 1; x <= 10; x++) {

					sum += x;

					System.out.println("The sum of numbers from 1 to 10: " + sum);

					// Factorial number
					int number = 5;
					int factorial = 1;

					for (int s = 1; s <= number; s++) {
						factorial *= s;
					}

					System.out.println("The factorial of " + number + " is: " + factorial);
				}

			}

			// print 1-20 but only skip the multiples of 5

			for (int k = 1; k <= 20; k++) {

				if (k % 5 == 0) {

					continue;
				}

				System.out.println(k);
			}

		}

	}

}
		
	

			
	
			
		
		
		
	   


