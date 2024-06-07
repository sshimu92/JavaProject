package StringBuilder;

public class Demo {

	public static void main(String[] args) {
		
		StringBuilder str= new StringBuilder("Anisul");
		
		System.out.println(str);
		
		str.append(" Islam");
		str.append(23);
		str.append(12.5);
		
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		
		str.delete(2, 5);
		System.out.println(str);
		
	}
}
