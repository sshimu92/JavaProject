package InterfaceDemo;

public class Car1 extends MotorisedVehicle implements Vehicle{

	@Override
	public void drive() {
	
		System.out.println("Car is moving");
		
	}

	@Override
	public void turnLeft() {
		
		System.out.println("Car is turning left");
		
	}

	@Override
	public void brake() {
		
		System.out.println("The car is in brake mode");
		
		
	}

	
}
