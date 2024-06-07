package String;

public class Demo {

	public static void main(String[] args) {

		String s1 = "anisul Islam"; // Assign value directly
		String s2 = new String("Anisul Islam");

		char[] s3 = { 'a', 'n', 'i', 's' };
		char[] s4 = { 'i', 's', 'l', 'a', 'm' };

		System.out.println(s4);
		System.out.println(s3);
		System.out.println(s1);
		System.out.println(s2);

		int len = s1.length();
		System.out.println("Length of s1: " + len);

		boolean con = s1.contains("Islam");
		System.out.println(con);

		boolean b = s1.isEmpty();
		System.out.println(b);

		
		if (s1.equals(s2)) {

			System.out.println("Equals");

		} else if (s1.equalsIgnoreCase(s2)) {

			System.out.println("Equals");

		} else {

			System.out.println("Not Equals");
		}

	}
}
