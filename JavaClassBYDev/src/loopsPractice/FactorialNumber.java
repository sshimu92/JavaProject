package loopsPractice;

public class FactorialNumber {

	public static void main(String[] args) {
        //4! = 4*3*2*1 = 24
		//5! = 5*4*3*2*1= 120
		
		
		int num = 4;
		int factorial = 1;

		for (int i = num; i>0; i--) {

			factorial = factorial * i;

			{
				System.out.println("Factorial is: " + factorial);
			}

		}

	}

}
