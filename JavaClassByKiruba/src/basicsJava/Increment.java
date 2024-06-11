package BasicsJava;

public class Increment {

	public static void main(String[] args) {
		
		int num=5;
		int postinc= num++;
		
		System.out.println("Post-increment: num= " + num + ","+" "+ "PostIncrementResult= " +postinc);
		
		num=5;
		int preinc= ++num;
		
		System.out.println("Pre-increment: num= " + num + ","+" "+"PreIncrementResult= " +preinc);
		

	}

}
