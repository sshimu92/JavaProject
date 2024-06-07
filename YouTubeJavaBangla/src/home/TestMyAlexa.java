package home;

import amazon.Alexa;

public class TestMyAlexa {

	public static void main(String[] args) { // static can be use without creating object.

		// object
		Alexa myAlexa = new Alexa();
		Alexa myFriendAlexa = new Alexa();

		myAlexa.whatIsYourName();
		myAlexa.changeYourName("Monica");
		myFriendAlexa.whatIsYourName();
		myAlexa.whatIsYourOwnerName("Mike");
		myAlexa.changeYourOwnerName("Sam");
		myAlexa.shopForMe(30);

	}
	
}
