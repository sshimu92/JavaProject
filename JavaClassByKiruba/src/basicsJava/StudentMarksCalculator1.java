package BasicsJava;

public class StudentMarksCalculator1 {

	public static void main(String[] args) {
	   
		int averagePercentage =85;
		
		if(averagePercentage >= 90) {
			
			System.out.println("Gold Medalist");
		
		}else if(averagePercentage >= 80){
			
			System.out.println("First Class");
			
		}else if(averagePercentage >= 60) {
			
			System.out.println("Second Class");
		
		}else if(averagePercentage >= 40) {
			
			System.out.println("Third Class");
		
		}else{
			
			System.out.println("Fail");
		}
	

	}

}
