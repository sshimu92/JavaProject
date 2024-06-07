package Operators;

public class BitwiseOperator {

	public static void main(String[] args) {
	
		int a= 32;
		int b= 12;
		int c;
		
		c= a&b;
		System.out.println("a&b = "+ c);
		
		c= a|b;
		System.out.println("a|b = "+ c);
		
		c= a^b;
		System.out.println("a^b = "+ c);
		
		c= a>>3; // 32/2 16/2 8/2 =4 (Right shift)
		System.out.println("a>>b ="+ c);
		
		c= a<<3; // 32*2 64*2 128*2 = 256 (Left shift)
		System.out.println("a<<b ="+ c);
		

	}

}
