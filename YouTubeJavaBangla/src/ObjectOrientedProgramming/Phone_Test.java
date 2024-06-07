package ObjectOrientedProgramming;

public class Phone_Test {

	public static void main(String[] args) {
		
		//Object
		Phone myPhone= new Phone();
		Phone myIphone= new Phone("Iphone7", true, true, false, true);
		Phone mySamsung= new Phone("galaxy s8", true, true, true, true);
		Phone myNokia3310= new Phone("3310", false, false, false, false);
		
		
		int[] nums= new int[] {1234, 54682, 297632, 65997, 16494, 87961,666468,798632};
		
		
		//Method call
		//myPhone.call();
		myPhone.groupSms(nums, "Hi! Are you guys coming tomorrow");
		myPhone.call(123456789);
		myPhone.showModel();
		myPhone.showContacts();
		System.out.println("--------------");
		
		myIphone.settings();
		System.out.println("--------------");
		mySamsung.settings();
		System.out.println("--------------");
		myNokia3310.settings();
		
		myIphone.takePhoto();
		mySamsung.takePhoto();
		myNokia3310.takePhoto();
		
		
		
		
		
		
		
		
	}

}
