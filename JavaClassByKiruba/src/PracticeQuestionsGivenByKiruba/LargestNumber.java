package PracticeQuestionsGivenByKiruba;

import java.util.Scanner;

public class LargestNumber {
	
	public int N, D;
	
	public void inputAcceptor() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter N D (space-separated): ");
		
		String input= sc.nextLine();
		
		inputValidator(input);
	}

	public void inputValidator(String input) {
		
		String[] inputs= input.split(" ");
		
		try {
			N= Integer.parseInt(inputs[0]);
			D= Integer.parseInt(inputs[1]);
			
			if(N<0 || D<0) {
				
				System.out.println("Give proper input not negative values");
			
			}else if(D>9) {
				
				System.out.println("Give proper input not digit greater than 9");
				
			}else if(N==0) {
				
				System.out.println("Give proper input not number(N) equals to zero");
			
			}else {
				
				int result= findLargestNumber(N, D);
				
				System.out.println(result);
			}
			
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Invalid input format. Please enter N D as space-separated values.");
		}
	}

	public int findLargestNumber(int N, int D) {
		
		for(int L=N-1; L>0; L--) {
			
			if(containsDigit(L, D)) {
				
				return L;
			}
		}
	
		return -1;
	
	}

	public boolean containsDigit(int number, int digit) {
		 
		while (number > 0) {
	            if (number % 10 == digit) {
	                return true;
	            }
	            number /= 10;
	        }
	        return false;
		
	}
	public void outputPrinter(Object output) {
		
		System.out.println("Expected ouput:");
		System.out.println(output);

	}

    public static void main(String[] args) {
		
		LargestNumber largestNumber= new LargestNumber();
		
		largestNumber.inputAcceptor();
	}
}
