package RandomNumber;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int randomNumber = r.nextInt(3); // 0 to 2
		System.out.println(randomNumber);
		
		int randomNumber1 = (int) (Math.random()*10) + 1; // 0 to 10
		System.out.println(randomNumber1);
		
		
	}
}
