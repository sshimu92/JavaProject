package InterfaceDemo;

public class Train implements Vehicle, PublicTransport{

	@Override
	public void drive() {
		
		System.out.println("Train is moving");
	}

	@Override
	public void turnLeft() {
		
		System.out.println("The train is turning left");
		
	}

	@Override
	public void brake() {
		
		System.out.println("The train is in brake mode");
		
	}

	@Override
	public void getNumberOfPeople() {
		
		System.out.println("Get phone number and call people");
		
	}

	
	
}
