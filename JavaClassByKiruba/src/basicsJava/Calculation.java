package BasicsJava;

public class Calculation {

	int a= 10;
	int b= 20; //Global Variables: (means it can be accessible for all the methods which is in the class).
	
	
	public int sum() {
		int result= a+b;
		return result;
	}
	
    public int sub() {
		int result= a-b;
		return result;
	}
    
    public int mul() {
		int a=3; 
		int b=4; //This variable called local variables
		int result= a*b;
		return result;
	}
    
    public int div() {
		int a=30; 
		int b=10;
		int result= a/b;
		return result;
	}
	
	public static void main(String[] args) {
		
		Calculation c= new Calculation();
		
		System.out.println(c.sum());
		System.out.println(c.sub());
		System.out.println(c.mul());
		System.out.println(c.div());
	}
}
