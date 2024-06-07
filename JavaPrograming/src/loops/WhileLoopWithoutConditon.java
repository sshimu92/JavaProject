package loops;

public class WhileLoopWithoutConditon {

	public static void main(String[] args) {
		
		//While loop without condition how is possible?
		
		int i=1;
		
		while(true) {
			
			System.out.println("Hello");
			i++;
			
			if(i==10) {
				
				break;
			}
		}

	}

}
