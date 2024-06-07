package MathClass;

public class Demo1 {

	public static void main(String[] args) {
		
		int x= 20;
		int y= 10;
		double a= 2;
		double b= 3;
		
		int max= Math.max(x, y);
		System.out.println("Maximum Number= "+ max);
		
		int min= Math.min(x, y);
		System.out.println("Minimum Number= "+ min);
		
		int absolute= Math.abs(y);
		System.out.println("Absolute of Y= "+ absolute);
		
		double power= Math.pow(a, b);
		System.out.println("X to the power Y= "+ power);
		
		
		int round= Math.round(8.5f);
		System.out.println("Round of 8.5f= "+ round);
		
		double pi= Math.PI;
		System.out.println("PI= "+ pi);

	}

}
