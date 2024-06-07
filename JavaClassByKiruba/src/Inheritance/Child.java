package Inheritance;

public class Child extends Parent{

	int c= a+b;
	String phone= "iphone15";
	
	public void camera() {
		
		System.out.println("Can take pictures");
	}
	
	public static void main(String[] args) {
		
		Child c= new Child();
		
		c.display();
	}


}
