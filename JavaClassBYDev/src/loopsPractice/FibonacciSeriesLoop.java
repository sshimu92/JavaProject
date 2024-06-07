package loopsPractice;

public class FibonacciSeriesLoop {

	public static void main(String[] args) {
		
	    int totalTerm=10;
	    int a=0;
	    int b=1;
	    
	    for(int i=1; i<=totalTerm; i++) {
	    	
	    	System.out.print(a + " , ");
	    	
	    	int sum= a+b;
	    	a= b;
	    	b= sum;
	    }

	}

}
