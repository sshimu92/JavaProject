package BasicsJava;

public class BiggestNumberFinder {

	public static void main(String[] args) {
		
		
        int[] numbers = {10, 25, 7, 48, 92, 15};

        int maxNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            
        	
        	if (numbers[i] > maxNumber) {
                
            	maxNumber = numbers[i];
            }
        
        }      System.out.println("The biggest number is: " + maxNumber);

        
	}

}
