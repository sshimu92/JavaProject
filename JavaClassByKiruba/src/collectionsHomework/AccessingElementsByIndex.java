package collectionsHomework;

import java.util.ArrayList;

public class AccessingElementsByIndex {
	
//	Create an ArrayList of strings containing the names "Alice", "Bob", and "Charlie".
//	Print the second element of the ArrayList (Bob).
//	Retrieve and print the first and last elements of the ArrayList

	public static void main(String[] args) {
		
		ArrayList<String> list1= new ArrayList<>();
		
		list1.add("Alice");
		list1.add("Bob");
		list1.add("Charlie");
		
		System.out.print("Second Element of the ArrayList: ");
		
		System.out.print(list1.get(1));
		
		System.out.println(" ");
		
		System.out.print("First and Last elemelnts of the ArrayList: "+ list1.getFirst()+" & "+ list1.getLast());
	

	}

}
