package jump;

public class BreakStatement {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=100; i++) {
			
			if(i==20) {
				break;
			}
		
			System.out.println(i);
		}

		System.out.println("***********************");
		
		for(int i=1; i<=100; i+=2) {
			
			if(i==10) {
				break;
			}
		
			System.out.println(i);
		}
	}

}
