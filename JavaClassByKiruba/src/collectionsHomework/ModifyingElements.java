package collectionsHomework;

import java.util.ArrayList;
import java.util.List;

public class ModifyingElements {

//	Create an ArrayList of doubles containing the numbers 1.5, 2.7, and 3.14.
//	Change the second element of the ArrayList to 5.0.
//	Print the modified ArrayList.
	
	public static void main(String[] args) {

		// Modifying Elements.
		ArrayList<Double> list = new ArrayList<>();

		list.add(1.5);
		list.add(2.7);
		list.add(3.14);

		// Replaced second element to 5.0.
		list.set(1, 5.0);
		System.out.println(list);

	}

}    
	  

