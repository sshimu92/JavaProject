package beginnerJava;

public class BoxVolumeTest {

	public static void main(String[] args) {
		
		System.out.println("Box One: ");
		
		Box b1 = new Box(10,10,10);
		b1.displayVol();
		
		System.out.println(" ");
		
		System.out.println("Box Two: ");
		
		Box b2 = new Box(20,30,10);
		b2.displayVol();
		
	}
}
