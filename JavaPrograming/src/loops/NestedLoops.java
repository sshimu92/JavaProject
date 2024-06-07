package loops;

public class NestedLoops {

	public static void main(String[] args) {

		//upside-down pattern
		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j);
			}
			System.out.println();
		}
        
		//Triangle pattern
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<i; j++) {
				
				System.out.print(j);
			}
		      System.out.println();
		}
	     
		//Pyramid pattern
		
	
	}

}
