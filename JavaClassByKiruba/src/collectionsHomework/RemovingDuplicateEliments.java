package collectionsHomework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class RemovingDuplicateEliments {
	
//	Create an ArrayList of integers containing some duplicate values.
//	Write a code to remove the duplicate elements from the ArrayList.
//	Print the ArrayList with only unique elements.

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(5);
		
		System.out.print("Original ArrayList with Duplicates: ");
		System.out.println(list+"");
		
		HashSet<Integer> set= new HashSet<>(list);
		
		list.clear();
		list.addAll(set);
		
		System.out.print("ArrayList after removing duplicates: ");
		System.out.println(list);
		

	}

}
