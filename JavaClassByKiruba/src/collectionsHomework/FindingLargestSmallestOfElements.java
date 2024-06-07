package collectionsHomework;

import java.util.ArrayList;
import java.util.Collections;

public class FindingLargestSmallestOfElements {
	
//	Create an ArrayList of integers containing random numbers.
//	Write a code to find the largest and smallest numbers in the ArrayList.
//	Print the largest and smallest numbers.

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<>();
		
		list.add(10);
		list.add(50);
		list.add(200);
		list.add(70);
		list.add(65);
		
		
		System.out.print("Smallest Number of the ArrayList: ");
		
		int minNumber= list.stream().min(Integer :: compareTo).orElseThrow();
		System.out.println(minNumber);
		
		
		
		System.out.print("Largest Number of the ArrayList: ");
		
		int maxNumber= list.stream().max(Integer :: compareTo).orElseThrow();
		System.out.println(maxNumber);
		
		
		
	}
}
