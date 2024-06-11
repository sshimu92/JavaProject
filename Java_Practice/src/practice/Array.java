package practice;

import java.util.Arrays;

public class Array {
 
	public static void main(String[] args) {
		
//		int[] array = {2, 6, 8};
	
//		System.out.println(Arrays.toString(array));
		
		int array[] = new int[5] ;
		
		array[0]=  2;
		array[1] = 6;
		array[2] = 8;
		array[3] = 10;
		array[4] = 12;
		
		String num = Arrays.toString(array);
		
		System.out.println("Array values: "+ num);
		System.out.println("Array Size: "+ array.length);
		
	}
	
}
