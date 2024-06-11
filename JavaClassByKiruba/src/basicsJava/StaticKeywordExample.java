package BasicsJava;

public class StaticKeywordExample {

	static int a;
	static int b;
	
	public void display1() {
		
		System.out.println("The value of a and b is: "+a+" "+b);
	}
	
    public static void display2() {
		
		System.out.println("The value of a and b is: "+a+" "+b);
    
    }
    
  //if you have static you don't need object for the static keyword but you cannot run without main method.
    public static void main(String[] args) { 
    
    StaticKeywordExample sk1= new StaticKeywordExample();
    	
    	sk1.a= 25;
    	sk1.b= 45;
    	sk1.display1();
    	
    	display2(); //you don't have to have to write object for static method.

	}

}
