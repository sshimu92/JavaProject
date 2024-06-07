package stringPalindrome;

public class demo {

	public static void main(String[] args) {
		
		String s1= "madam";  //123 Not a Palindrome
		
		StringBuffer sb= new StringBuffer(s1);
		
        String s2= sb.reverse().toString();
		
        if(s1.equals(s2)) {
        	
        	System.out.println("Palindrome");
        
        }else {
        	
        	System.out.println("Not a Palindrome");
        }
	}
}
