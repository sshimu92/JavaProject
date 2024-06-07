package ObjectOrientedProgramming;

public class Phone {

	//Property
	private String model= "iphone7";
	private String[] contacts= new String[] {"Gabriel", "John", "Mike", "Smith", "Mathew", "Karen", "Debi"};
	private boolean isGpsEnabled= false;
	private boolean isBluetoothEnabled= false;
	private boolean hasCamera= false;
	private boolean isFaceDetectionEnabled= false;
	private boolean isPaymentCapable= false;
	
	

	/*Access Modifiers: public, private, default, protected.
	 * Public: can be access from different package and class.
	 * Default: can be access from same package and class but cannot be access from different package and class.
	 * Private: cannot access from both.
	 * Protected:  
	 */
	
	
	public void takePhoto() {
		
		System.out.println(this.model+ " " +"Taking pictures using camera.");
	}
	
	
	public Phone() {
			
	}
	
	public Phone(String model, boolean isGpsEnabled, boolean isBluetoothEnabled, boolean isFaceDetectionEnabled, boolean isPaymentCapable) {
		this.model= model;
		this.isGpsEnabled= isGpsEnabled;
		this.isBluetoothEnabled= isBluetoothEnabled;
		this.isFaceDetectionEnabled= isFaceDetectionEnabled;
	} 
	
	public void settings() {
		System.out.println("Settings for : "+ this.model);
		System.out.println("- Display");
		System.out.println("- Privacy");
		System.out.println("- Message");
		System.out.println("- Call");
		System.out.println("- Contacts");
		
		if(isGpsEnabled==true) {
			
			System.out.println("- GPS");
		} 
		if(isBluetoothEnabled==true) {
			
			System.out.println("- Bluetooth");
		}
		if(isFaceDetectionEnabled==true) {
			
			System.out.println("- FaceDetection");
		}
		if (isPaymentCapable==true) {
			
			System.out.println("- PaymentCapable");
		}
	}
	
	public void showContacts() {
		
	
		for(int i=0; i<contacts.length; i++) {
		
			System.out.println(i + " " +contacts[i]);
		}
		    
	}
	
	//Method.
	 private void call() { //private
		
		System.out.println("Calling...Unknown");
	}
	
	 public void call(int number){ //default
		 
		 System.out.println("Calling..."+ number);
	 }
	
     public void groupSms(int[] numbers, String msg){
		
    	 for(int i=0; i<numbers.length; i++) {
    		
    		 System.out.println(i + ":" +"Sending message: "+ msg + "  to:" +numbers[0]);}
    	 }
		
     public void showModel() {
    	
    	 System.out.println("Model for this phone is.." +model);
     }

     }


