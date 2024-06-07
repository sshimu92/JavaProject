package Examples;

public class IfElseStatement {

	public static void main(String[] args) {
		
		String product= "iphone";
		
		System.out.println("Welcome to Mobile Market!");
		
		if(product.equals("iphone")) {
			
			System.out.println("Price for iphone is: $1000");
		
		}else if(product.equals("Samsung")) {
			
			System.out.println("Price for samsung is: $950");
		
		}else {
			
			System.out.println("Sorry we don't have this product");
		}
			
			

	}

}
