package PolyMorphism;

public class PolyMorphosm {

	public static void main(String[] args) {
		
		Shape s;
		
		s= new Shape();
		s.area();
		
		s= new Square();
		s.area();
		
		s= new Circle();
		s.area();
		
	}
}
