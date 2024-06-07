package staticMethod;

public class StaticMethod {

	//In static method u cannot use non static method and variable .But in non static method u can use static method.
	
	static int x;
	
	public void display1() { //Non Static Method
		
		System.out.println("I am non static method");
	
	}
	
    public static void display2() { //Static Method
		
    	System.out.println(" "+x);
    	
		System.out.println("I am static method");
	}
}
