package Collections;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 20; i++) {

			list.add(i);
		}

		System.out.print("Even Positions Elements are: ");

		for (int i = 1; i < list.size(); i += 2) {

			System.out.print(list.get(i) + " ");

		}

		for (int i = list.size() - 1; i >= 0; i--) {

			if (i % 2 != 0) {

				list.remove(i);

			}

			System.out.println("After removing odd elements: " + list);
		}
	}
}
