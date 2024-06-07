package Examples;

public class NestedForLoops {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				
				System.out.print(i);
			}
		       System.out.println();
		}

		System.out.println("============Triangle Pattern=============");
		
		for(int k=1; k<=5; k++) {
			
			for(int s=1; s<=k; s++) {
				
				System.out.print(s);
			}
		      System.out.println();
		}
	
	     System.out.println("=========Upside-down Pattern=========");
	     
	     for(int m=5; m>=1; m--) {
	    	 
	    	 for(int n=1; n<=m; n++) {
	    		 
	    		 System.out.print(m);
	    	 }
	           
	    	   System.out.println();
	     
	     }
	
	}

}
