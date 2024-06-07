package String;

public class Demo4 {

	public static void main(String[] args) {
		
		//Primitive to String data type
		
		int i= 100;
		
		String s= Integer.toString(i);
		System.out.println(s);
		
		boolean b= true;
		
		String n= Boolean.toString(b);
		System.out.println(n);
		
		
		//String to Primitive 
		
		String m= "32";
		
		int k= Integer.parseInt(m);
		System.out.println(k);
		
		String a= "50";
		
		double d= Double.parseDouble(a);
		System.out.println(d);
		
		String c= "70";
		
		int v= Integer.valueOf(c);
		System.out.println(v);
		
		
	}

}