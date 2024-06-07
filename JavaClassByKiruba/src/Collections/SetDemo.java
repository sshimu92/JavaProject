package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
//		Set set= new HashSet();
//		
//		set.add("A");
//		set.add("B");
//		set.add(20);
//		set.add("A");
//		set.add("Null");
		
		
		ArrayList<String> list= new ArrayList();
		
		list.add("Monday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.add("Thursday");
		list.add("Friday");
		list.add("Monday");
		list.add("Tuesday");
		
		System.out.println(list);
		
		
		HashSet<String> set= new HashSet();
		
		set.addAll(list);
		System.out.println(set);
		
		
		Set<Integer> set1= new HashSet();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		System.out.println(set1);
		
		//Converted to Set to the List.
		List<String> list1= new ArrayList(set1);
		
	}

}
