package BasicsJava;

public class SwitchStatementDeclareVariable {

	public static void main(String[] args) {
		
		int num=40;
		int result= num*5 + num;
		
		switch(num) {
		
		case 20:
			System.out.println("Case 20: Result = " + result);
			break;
		
		case 40:
			System.out.println("Case 40: Result = " + result);
			break;
		
		case 60:
			System.out.println("Case 60: Result = " + result);
			break;
		
		default:
			System.out.println("Default Case: Result = " + result);
		}

	}

}
