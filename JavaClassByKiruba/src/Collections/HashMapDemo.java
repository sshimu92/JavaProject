package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashMapDemo {

	//By using key we can access 
	//keys should be unique
	//values can be duplicate
	
	public static void main(String[] args) {
		
		List<String> list= new ArrayList<>();
		
		//Create HaspMap
		HashMap<Integer, String> languages= new HashMap<>();
		
		languages.put(9, "Java");
		languages.put(8, "C++");
		languages.put(4, "C");
		languages.put(6, "Python");
		languages.put(12, "JavaScript");
		languages.put(11, "Ruby");
		
		System.out.println(languages);
		
		languages.put(8, "Kotlin");//Updating the map
		
		System.out.println(languages);
		
		//Removing element
		languages.remove(8);
		
		HashMap<Integer, String> languages1= new HashMap<>(languages);
		
		System.out.println(languages.size());
		
		//Create for loop for iterating through keys.
		for(int key: languages.keySet()) {
			
			System.out.println(key);
		
		}
		
		//Create for loop iterate through values
		for(String value: languages.values()) {
			
			System.out.println(value);
		}
	
		//Create the loop to iterate through keys and values
		for(HashMap.Entry<Integer, String> entry: languages.entrySet()) {
			
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
	
		//Create HashMap with set as keys and list as values.
		HashMap<Set<String>,List<String>> map= new HashMap<>();
		
		//Add 5 elements to HashMap 'map'
		Set<String> set= new HashSet<>();
		
		set.add("Java");
		set.add("Python");
		set.add("C++");
		set.add("C");
		
		List<String> list1= new ArrayList<>();
		
		list1.add("oop");
		list1.add("scripting languages");
		list1.add("functional programming");
		list1.add("web development");
		
		map.put(set, list1);
		
		System.out.println(map);
		
		
	
	}
}
