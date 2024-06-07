package loopsPractice;

public class NestedForLoops {

	public static void main(String[] args) {
		
		int weeks= 3;
		int days= 7;
		
		//outer loop
		for(int i=1; i<=weeks; i++) {
	
			System.out.println("Week:"+""+ i);
			
			//inner loop
		  for(int j=1; j<=days; j++) {
			  
			  System.out.println("Day:"+" "+ j);
		  }
		  
		  System.out.println("======================================");
		 
		  int Month= 1;
		  int Day= 28;
		  
		  for(int k=1; k<=Month; k++) {
			  
			  System.out.println("Month:"+" " + k);
			  
			for(int j=1; j<=Day; j++) {
				
				System.out.println("Day:"+" " + j);
			}
		  }
		
		
		}
		  
		    
			
			
		}

	}


