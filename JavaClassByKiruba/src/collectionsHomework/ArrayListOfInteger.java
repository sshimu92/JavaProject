package collectionsHomework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOfInteger {

	//Create an ArrayList of integers.
	//Add the numbers 10, 20, 30, and 40 to the ArrayList.
	//Use a loop to print each element of the ArrayList on a separate line
	
	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.print("Elements of the ArrayList: ");
		
		for(int number : list) {
			
			System.out.print(number +" ");
		}
		
		
	}  
	
}  
	
		

