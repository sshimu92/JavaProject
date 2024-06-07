package Inheritance;

public class SubClass extends BaseClass {

    //int num= 25;
	
	public void display() {
		
		super.display();
		
		super.num= 50;
		
		System.out.println("I am parent mathod displaying value of num:"+ num);
	}


	public static void main(String[] args) {
		
		SubClass s= new SubClass();
		s.display();
	}

}

