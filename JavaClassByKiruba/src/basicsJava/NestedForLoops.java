package BasicsJava;

public class NestedForLoops {

	public static void main(String[] args) {
		
		 System.out.println("=========Upside-down pattern=========");	
	//Print upside-down triangle pattern
		for(int i=5; i>=1; i--) {
			
		 for(int j=1; j<=i; j++) {
			 
			 System.out.print(i);
		 }
		   System.out.println();
		   
		   
		   }
		
		   System.out.println("=========Triangle pattern=========");
		
	
	//Print Triangle Pattern
	      for(int i=1; i<=5; i++) { //Outer loop
	    	  
	    	  for(int j=1; j<=i; j++) { //Inner loop
	    		  
	    		  System.out.print(i);
	    	  }
	      
	           System.out.println();
	      }
	
	      
	      }
	
	
	}

	


