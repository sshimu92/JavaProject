package apple;

public class Siri {

	private static String name= "Alexa";
	private static int money= 1000;
	
	
	public static void turnTheTvOn() {
		
		System.out.println("Your TV is on...");
	}

	public static void whatIsYourName() {
		
		System.out.println("My name is "+ name);
		
	}
	
    public static void playMusic() {
		
		System.out.println("Music is on...");
  }
    public static void changeYourName(String n) {
		
		System.out.println("I like my new name "+ n);
    }
     public static void shopForMe(int spendThisMoney) {
    	 
    	 money= (money-spendThisMoney);
    	 System.out.println("I did shopping for you and your balance left is: "+ money);
     }

}