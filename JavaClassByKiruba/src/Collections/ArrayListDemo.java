package Collections;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Create a generic arrayList object of String type
		
		ArrayList<String> list= new ArrayList<String>();
	
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("null");
		list.add("d");
		
		System.out.println(list);
		
		list.remove("d");
		
		list.set(3, null);
		System.out.println(list);
		
		ArrayList<String> list1= new ArrayList<String>();
	
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Orange");
		list1.add("Mango");
		list1.add("Grapes");
		
		String str= list1.get(3);
		System.out.println(str);
		
		boolean b= list1.contains("Mango");
		System.out.println(b);
		
		int size= list1.size();
		System.out.println(size);
		
		int position= list1.indexOf("Mango");
		System.out.println(position);
		
		//Create iterator object.
		
		Iterator<String> iterator= list1.iterator();
	
		//Checking the availability of next element in the list using hasNext
	
		while(iterator.hasNext()){
			
			//Moving the cursor to next element using reference variable iterator
			String str1= iterator.next();
			System.out.println(str1);
			
		}
	
		//Creating for loop to iterate through the list
	
		for(int i=0; i<list1.size(); i++) {
			
			System.out.println(list1.get(i));
		}
	
		//Creating for each loop
	
		for(String str2:list1) {
			
			System.out.println(str2);
		}
	}
	
	
}
