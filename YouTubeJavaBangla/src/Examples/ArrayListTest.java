package Examples;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> name= new ArrayList<String>();
		name.add("John");
		name.add("Mike");
		name.add("Michael");
		name.add("Shakira");
		name.add("Don");
		
		
		System.out.println(name.size());
		System.out.println(name.get(1));
		
		System.out.println("*******************");
		
		for(int i=0; i<name.size(); i++) {
			
			System.out.println(name.get(i));
			
		}
		
		System.out.println("*******************");
		
		
		name.add("New name");
		
       for(int i=0; i<name.size(); i++) {
			
			System.out.println(name.get(i));	

	}
       System.out.println("*******************");
        name.remove(5);
       
        for(int i=0; i<name.size(); i++) {
		
		    System.out.println(name.get(i));
	} }
	
}