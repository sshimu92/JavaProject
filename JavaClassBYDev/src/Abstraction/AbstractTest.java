package Abstraction;

public class AbstractTest {

	public static void main(String[] args) {
		
		MobileUser m;
		
		m= new Mike();
		m.sendMessage();
		m.call();
		
		m= new Robin();
		m.sendMessage();
		m.call();
		
		m= new Daniel();
		m.sendMessage();
		m.call();

	}

}
