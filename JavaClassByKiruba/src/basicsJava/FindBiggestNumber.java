package BasicsJava;

public class FindBiggestNumber {

	public static void main(String[] args) {
		
		int num1=95;
		int num2=200;
		int num3=65;
		
		if(num1>num2 && num1>num3) {
			
			System.out.println("Biggest Number is: "+ num1);
		
		}else if(num2>num1 && num2>num3) {
			
			System.out.println("Biggest Number is: "+ num2);
		
		}else if(num3>num1 && num3>num2){
			
			System.out.println("Biggest Number is: "+ num3);
		
		}else {
			
			System.out.println("Not a valid number");
		}
				

	}

}
