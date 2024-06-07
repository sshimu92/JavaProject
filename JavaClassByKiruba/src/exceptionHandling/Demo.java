package exceptionHandling;

public class Demo {

	public static void main(String[] args) {
		
		int[] num= new int[4];
		
		num[0]= 10;
		num[1]= 10;
		num[2]= 10;
		num[3]= 10;
		
		try {
			System.out.println(num[4]);
		
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println(e);
		
		}finally {
			System.out.println("Exception Handled");
		}

	}

}
