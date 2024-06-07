package wrapper;

public class Demo {

	public static void main(String[] args) {
		
		//Primitive ---> Object
		int x= 30;
		
//		Integer y= Integer.valueOf(x);
//		System.out.println(y);
		
		Integer z= x; //Autoboxing
		System.out.println("z = "+ z);
		
		
		
		//Object --> Primitive data type
		Double d= new Double(10.25);
		System.out.println("d = "+ d);
		
		double e= d; //Unboxing
		System.out.println("e = "+ e);
		
		
		
		
	}
}
