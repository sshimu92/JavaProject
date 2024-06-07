package home1;

import apple.Siri;

public class TestSiri {

	public static void main(String[] args) {
		
		Siri mySiri= new Siri();
		
		mySiri.turnTheTvOn();
		mySiri.playMusic();
		mySiri.whatIsYourName();
		mySiri.changeYourName("Simi");
		mySiri.shopForMe(100);
		
	}

}
