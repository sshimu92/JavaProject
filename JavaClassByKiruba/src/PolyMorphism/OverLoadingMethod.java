package PolyMorphism;

public class OverLoadingMethod {

	//PolyMorPhism() - Single entity with multiple forms.
	
	//overloading()- 
	//overriding()- 
	
	public void add(int a, int b) {
		
		System.out.println(a+b);
	}

	public void add(int a, int b, double c) {
		
		System.out.println(a+b);
	}
	
    public void add(double a, double b) {
		
		System.out.println(a+b);
    }
    
    public void add(String a, int b) {
		
		System.out.println(a+b);
		
    }
    //Overloading()- Static method dispatch.
    
    public static void main(String[] args) {
		
    	OverLoadingMethod e1= new OverLoadingMethod();
    	e1.add("Mike", 45);
    	
	}
}
