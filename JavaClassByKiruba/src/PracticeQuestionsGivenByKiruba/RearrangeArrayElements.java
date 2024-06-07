package PracticeQuestionsGivenByKiruba;

import java.util.Scanner;

public class RearrangeArrayElements {
	
	private int[] inputArray;

	public void inputAcceptor() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		
		int size= sc.nextInt();
		
		if(inputArraySizeValidator(size)) {
			
			inputArray= new int[size];
			
			System.out.println("Enter the sorted array:");
			
			for(int i=0; i<size; i++) {
				
				inputArray[i]= sc.nextInt();
		
			}
		    
			if(inputArrayValidator(inputArray)) {
				
				int[] rearrangedArray= computeRearrangedArray(inputArray);
				
				displayResult(rearrangedArray);
				
			}else {
				
				displayResult(null);
			}
		
		}else {
			
			displayResult(null);}
		}
		
		public boolean inputArraySizeValidator(int size) {
			
			 return size > 0;
		
		}
		
		public boolean inputArrayValidator(int[] array) {
			
			for(int i=0; i<array.length-1; i++) {
				
				if(array[i] > array[i+1]) {
					
					return false;
				}
			}
		
			return true;
		
		}
		
		public int[] computeRearrangedArray(int[] array) {
			
			int[] rearrangedArray= new int[array.length];
			int left= 0, right= array.length - 1;
			boolean flag= true;
			
			for(int i=0; i<array.length; i++) {
				
				if(flag) {
					rearrangedArray[i]= array[right];
					right--;
				
				}else {
					rearrangedArray[i]= array[left];
					left++;
				}
				
				flag= !flag;
			}
			
			return rearrangedArray;
		}
	
		public void displayResult(int[] array) {
			
			if(array != null) {
				
				System.out.println("Rearranged Array:");
				
				for(int num: array) {
					
					System.out.print(num+ " ");
				}
			
				System.out.println();
			
			}else {
				System.out.println("Give proper input");}
			}
		
			public static void main(String[] args) {
				
			RearrangeArrayElements rae= new RearrangeArrayElements();
			
			rae.inputAcceptor();
			
			}
		
	}
	


