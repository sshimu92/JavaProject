package jump;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			
			if(i==10) {
				continue;
			}
		
			System.out.println(i);
		}

		System.out.println("*****************");
		
		for(int j=1; j<=10; j+=3) { // j= 1; 1+3=4; 4+3=7; 7+3=10.
			
			if(j==10) {
				continue;
			}
		
			System.out.println(j);
		}
	

		System.out.println("*****************");
		
		for(int k=1; k<=100; k+=3) { // j= 1; 1+3=4; 4+3=7; 7+3=10; 10+3=13
			
			if(k==10) {
				continue;
			}
		
			if(k>13) {
				break;
			}
		
			System.out.println(k);
		}
	}

}
