package Polymorphism;

public class PolymorphosmTest {

	public static void main(String[] args) {

		Human Monica = new Human("Monica");
		Transport t = new Bus("Shohag Paribahan");

		Monica.travel(t, "Chittagong");

	}

}

class Human {
	String name;

	public Human(String name) {
		this.name = name;
	}

	public void travel(Transport transport, String destination) {

		System.out.println(this.name + " is " + "traveling to " + destination + " by " + transport.name);

	}

}

class Bus extends Transport {

	public Bus(String name) {
		this.name = name;
	}

	class Train extends Transport {

		public Train(String name) {
			this.name = name;
		}

	}

}

class Transport {
	String name;

}
	

