package Array;

public class ArrayExample {

	//Array is an data structure that stores element of the same type
	//How to declare an array? --- Datatype[] arrayName;
	
	public static void main(String[] arg) {
	
	   int[] num= new int[5]; //The length of the array cannot be changed after it has been created.
		
	//Display the arrays length i.e, the number of elements we put into the array.
	   
	   int length= num.length;
	   
	   System.out.println("The size of an array is: "+length);
	   
	   //initializing array and accessing its elements.
	   
	   num[0]= 23;
	   num[1]= 32;
	   num[2]= 43;
	   num[3]= 56;
	   num[4]= 65;
	   
	   String[] seasons= new String[] {"Winter", "Spring", "Summer", "Fall"};
	   
	   int[] values= {21,32,65,54,98,87};
	   
	   System.out.println(num[2]);
	   System.out.println(seasons[2]);
	   
	   for(int i=0; i<values.length; i++) {
		   
		   System.out.println(values[i]);
	   }
	
	}
	
	
	
	
	
	
	
}
