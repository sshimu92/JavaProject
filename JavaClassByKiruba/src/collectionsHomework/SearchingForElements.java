package collectionsHomework;

import java.util.ArrayList;

public class SearchingForElements {

//	Create an ArrayList of integers containing the numbers 1, 4, 2, 5, 3.
//	Write a code to check if the number 4 exists in the ArrayList.
//	Print a message indicating whether the number was found or not.
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<>();
		
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(5);
		list.add(3);
		
		int numberToCheck= 4;
		
		boolean numberFound= list.contains(numberToCheck);
		
		if(numberFound) {
			
			System.out.println("Number"+" "+ numberToCheck +" "+"found in the ArrayList");
		
		}else {
			
			System.out.println("Not found in the ArrayList");
		}
		
		
	}

}
