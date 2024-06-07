package staticMethod;

public class StaticMethod_Test {

	public static void main(String[] args) {
		
		StaticMethod ob1 = new StaticMethod(); //Non Static Method
		ob1.display1();
		
		StaticMethod.display2(); // Static Method
		
	}
	
}
