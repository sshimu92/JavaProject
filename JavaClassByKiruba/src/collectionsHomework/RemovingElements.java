package collectionsHomework;

import java.util.ArrayList;
import java.util.List;

public class RemovingElements {

//	Create an ArrayList of characters containing the letters 'a', 'b', 'c', and 'd'.
//	Remove the first element of the ArrayList.
//	Remove the element 'c' from the ArrayList.
//	Print the remaining elements of the ArrayList.
	
	public static void main(String[] args) {
		
		  //Removing Elements.
	    ArrayList<Character> chr= new ArrayList<>();
	    
	    chr.add('a');
	    chr.add('b');
	    chr.add('c');
	    chr.add('d');
	    
	    chr.remove(0);
	    chr.remove(Character.valueOf('c'));
	    
	    System.out.println("After removing characters: "+ chr);

	}

}
