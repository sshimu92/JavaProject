package collectionsHomework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversingAnArrayList {
	
//	Create an ArrayList of strings containing any words you like.
//	Reverse the order of the elements in the ArrayList.
//	Print the reversed ArrayList.

	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<>();
		
		list.add("Apple");
		list.add("Watermelon");
		list.add("Grapes");
		list.add("Orange");
		list.add("Mango");
		
		
		
		System.out.print("Original Words of the ArrayList: ");
		
		System.out.println(list);
		
		System.out.println(" ");
		
		Collections.reverse(list);
		
		System.out.print("Reversed Words of the ArrayList: ");
		
		System.out.println(list);
		
		
	}
}
