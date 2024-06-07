package collectionsHomework;

import java.util.ArrayList;
import java.util.Collections;


public class SortingAnArrayList {

//	Create an ArrayList of strings containing the words "apple", "banana", "cherry", and "orange".
//	Sort the ArrayList alphabetically.
//	Print the sorted ArrayList.
	
	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<>();
		
		list.add("Apple");
		list.add("Cherry");
		list.add("Banana");
		list.add("Orange");
		
		Collections.sort(list);
		
		System.out.println("Sorted ArrayList of fruits: ");
		
		for(String fruit : list) {
			
			System.out.println(fruit);
		}
	}
}
