package factorial;

import java.util.Scanner;

public class TimesTableDemo_NestedForLoops {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m, n;

		System.out.print("Enter Initial Number: ");
		m = sc.nextInt(); //m=5

		System.out.print("Enter Final Number: ");
		n = sc.nextInt(); //n=10

		for (int i = m; i <= n; i++) {

			for (int j = 1; j <= 10; j++) {

				System.out.println(i + "x" + j + " = " + i * j);
			}
		
			System.out.println("\n\n");
		}
	}
}
