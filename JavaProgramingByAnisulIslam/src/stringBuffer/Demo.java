package stringBuffer;

public class Demo {

	public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer("Anisul");
		
		System.out.println(sb);
		
		sb.setLength(2);;
		System.out.println(sb);
	
		sb.append(" Islam");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.delete(0, 5);
		System.out.println(sb);
		
		
		
	
	}
}
