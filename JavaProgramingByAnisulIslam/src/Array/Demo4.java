package Array;

public class Demo4 {

	public static void main(String[] args) {
		
		int[] numbers= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		int sum= 0;
		
		for(int n: numbers) {
			
			sum= sum + n;
			
		}
	
		System.out.println("Total = "+ sum);
	}
	
}
