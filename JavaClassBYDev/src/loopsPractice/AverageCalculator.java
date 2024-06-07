package loopsPractice;

import java.util.ArrayList;

public class AverageCalculator {

	public static void main(String[] args) {
		
		ArrayList<Double> numbers=new ArrayList<>();
		
		numbers.add(4.5);
		numbers.add(6.7);
		numbers.add(9.2);
		numbers.add(3.8);
		
		double sum= 0.0;
		
		for(double num : numbers) {
			
			sum += num;
		}
          double average = sum / numbers.size();
          
          System.out.println("List of numbers: " + numbers);
          System.out.println("Sum: " + sum);
          System.out.println("Average: " + average);
	}

}
