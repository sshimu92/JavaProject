package BasicsJava;

public class SwitchStatements {

	public static void main(String[] args) {
		
		//Switch statemnts despatches immediately to the case block concerned.
		
		int day=5;
		
		switch(day) {
		
		case 1:
			System.out.println("Monday");
		
		case 2:
			System.out.println("Tuesday");
			
		case 3:
			System.out.println("Wednesday");
		
		case 4:
			System.out.println("Thursday");
		
		case 5:
			System.out.println("Friday");
		
		case 6:
			System.out.println("Saturday");	
		
		case 7:
			System.out.println("Sunday");
			break;
		
		default:
			System.out.println("Not a valid day");
			
		}

	}

}
