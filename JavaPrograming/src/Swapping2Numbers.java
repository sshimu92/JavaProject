
public class Swapping2Numbers {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("Before swapping the values are: " + a + " & " + b);

		// logic1 -Third variable
		int t = a;
		a = b;
		b = t;

		System.out.println("After swapping the values: " + a + " & " + b);

	}

}
