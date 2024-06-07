package Examples;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {

	public static void main(String[] args) throws InterruptedException {

		
		long i=ThreadLocalRandom.current().nextLong(1, 100);
		
		System.out.println(i);
		
		String s= "The quick brown fox jumps over the lazy dog";
		
        //Split method
		
		String[] arr=s.split(" ");
		
		for(String str:arr) {
			
			System.out.println(str);
			
		//SubString method
			
		String str1= s.substring(3, 8);
			
			System.out.println(str1);
			
	    //ToCharArray method
		char[] carr= s.toCharArray();
		
		for(char c:carr) {
			
			System.out.println(c);		
				
		
		}
		
		
		}

	}
	
}
