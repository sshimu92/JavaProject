package Inheritance;

public class Singer extends Human {

	
	public Singer(String name) {
		super(name);
		
	}
	
	@Override
	public void swim() {
	
		System.out.println("Sorry I don't know how to swim..");
	}




	public void singAsong(){
		
		System.out.println("Ami tomai bhalobashi...");
	}
}
