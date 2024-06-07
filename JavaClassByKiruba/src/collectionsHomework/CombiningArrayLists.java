package collectionsHomework;

import java.util.ArrayList;
import java.util.Collections;

public class CombiningArrayLists {
	
//	Create two ArrayLists of integers: one containing the numbers 1, 2, 3, and the other containing 4, 5, 6.
//	Combine the two ArrayLists into a single ArrayList.
//	Print the combined ArrayList.

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		
		ArrayList<Integer> list1= new ArrayList<>();
		
		list1.add(4);
		list1.add(5);
		list1.add(6);
		
	    ArrayList<Integer> combineList= new ArrayList<>();
	    
	    combineList.addAll(list);
	    combineList.addAll(list1);
	    
	    System.out.print("Combined ArrayLists: ");
	    
	    for(int number : combineList) {
	    	
	    	System.out.print(number+" ");
	    }
		
		
		
	}
}
