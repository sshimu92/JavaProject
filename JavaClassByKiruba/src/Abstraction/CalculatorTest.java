package Abstraction;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator c;

		c = new Add();
		c.add(20, 15);;
		c.display();
		

		c = new Sub();
		c.display();

		c = new Division();
		c.display();

	}

}
