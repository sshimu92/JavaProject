package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList<Integer> number= new ArrayList<>();
		
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(3, 40);
		
		//System.out.println(number);
		
		for(int i : number) {
			
			System.out.println("Numbers: "+ i +" ");
		}
	
		System.out.println("ArrayList contains: "+ number);
		
		System.out.println("Size = "+ number.size());
	
		//number.clear();
		
		boolean check= number.isEmpty();
		System.out.println("ArrayList Empty: "+ check);
		
		boolean contain= number.contains(30);
		System.out.println("Number 30 is in the list: "+ contain);
		
		int position= number.indexOf(40);
		System.out.println("The index of 20 is: "+ position);
		
		number.set(3, 50); //replace number with index
		System.out.println("After setting: "+ number);
		
		int x= number.get(1); //Check number by index
		System.out.println("Index of O = "+ x);
		
		

		
//      number.remove(1);
//		System.out.println("ArrayList after removing: "+ number);
	}
}
