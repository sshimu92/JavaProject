package beginnerJava;

import java.util.Scanner;

public class TemperatureConvertor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double celsius, fahrenheit;

		System.out.print("Celsius= ");

		celsius = sc.nextDouble();

		fahrenheit = 1.8 * celsius + 32;

		System.out.println("Fahrenheit= " + fahrenheit);

		System.out.print("Fahrenheit= ");

		fahrenheit = sc.nextDouble();

		celsius = 0.55 * fahrenheit - 32;

		System.out.println("celsius= " + celsius);

	}

}
