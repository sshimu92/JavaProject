package exceptionHandling;

public class demo1 {

	public static void main(String[] args) {

		System.out.println(printANumber());

	}

	private static int printANumber() {

		try {
			return 3;

		} catch (Exception e) {
			return 4;

		} finally {
			return 5;
		}

	}
}
