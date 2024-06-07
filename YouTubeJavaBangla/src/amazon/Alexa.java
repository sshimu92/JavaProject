package amazon;

public class Alexa { // Class

	private String name = "Alexa"; // "name" is property which value is "Alexa" and type is "String".
	private int money=100;
	
	
	public void shopForMe(int spendThisMuch) {
		
		money= (money-spendThisMuch);
		System.out.println("I did a shopping for you and your balance left: "+ money);
	}

	public void playRadio() {

		System.out.println("Playing Z-100");
	}

	public void whatDayIsToday() {

		System.out.println("It is Monday");
	}

	public void howManyInchesInFeet(double feet) {

		System.out.println("Inches in feet is: " + feet * 12 + " inches");

	}

	public void whatIsYourName() {

		System.out.println("My name is " + name);
	}

	public void thankYou() {

		System.out.println("My Pleasure");
	}

	public void howIsTheWeatherToday() {

		System.out.println("Gloomy Weather");
	}

	public void changeYourName(String n) {

		System.out.println("Wow I like my new name " + n);
		name = n;
	}

	public void whatIsYourOwnerName(String s) {

		System.out.println("My owner name is " + s);

		name = s;
	}

	public void changeYourOwnerName(String k) {

		System.out.println("Nice to meet you " + k);
		name = k;
	}

}
