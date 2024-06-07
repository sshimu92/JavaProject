package beginnerJava;

public class Box {

	double height, width, depth; //Instance Variable
	

	public Box(double height, double width, double depth) {  //Local Variable
		
		this.height = height;
		this.width = width;    
		this.depth = depth;
	}
	
	public void displayVol() {
		
		double vol = height * width * depth;
		
		System.out.println("Volume is: "+ vol);

	}
}
