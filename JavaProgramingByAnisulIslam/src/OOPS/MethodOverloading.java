package OOPS;

public class MethodOverloading {

	public void add(int a, int b) {

		System.out.println(a + b);
	}

	public void add(double a, int b) {

		System.out.println(a + b);
	}

	public void add(double a, int b, double c) {

		System.out.println(a + b + c);
	}

	public void add(int a, double c) {

		System.out.println(a + c);
	}
}
