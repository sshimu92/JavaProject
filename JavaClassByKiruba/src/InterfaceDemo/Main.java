package InterfaceDemo;

public class Main {

	public static void main(String[] args) {

		Train t = new Train();

		t.brake();
		t.drive();
		t.turnLeft();
		t.getNumberOfPeople();

		
		System.out.println("              ");
		
		
		Car1 c = new Car1();

		c.brake();
		c.drive();
		c.turnLeft();
		c.checkMotor();

	}

}
