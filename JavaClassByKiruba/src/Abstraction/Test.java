package Abstraction;

public class Test {

	public static void main(String[] args) {

		Bird b;

		b = new BlueBird();
		b.fly();
		b.color();
		b.size();

		b = new YellowBird();
		b.fly();
		b.color();
		b.size();

		
		Car c;

		c = new ElectricCar();
		c.start();

		c = new DiesalCar();
		c.start();

		c= new PetrolCar();
		c.start();
		

	}

}
