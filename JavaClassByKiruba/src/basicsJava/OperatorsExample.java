package BasicsJava;

public class OperatorsExample {

	public static void main(String[] args) {
		
		//Develop a java program that calculated the total and average marks of a student.
		//Print the marks of each subject also.
		//Declare the marks of the student and computer & display the total and average marks.
		//Use the required operators.
		
		//Expected output:
		//Subject1:90
		//Subject1:80
		//Subject1:70
		//Subject1:60
		//Subject1:50
		
		
		//Total marks:450
		//Average marks:90
		
		int sub1= 90;
		int sub2= 80;
		int sub3= 70;
		int sub4= 60;
		int sub5= 50;
		
		int sum= (sub1+sub2+sub3+sub4+sub5);
		
		System.out.println("Total Marks: "+sum);
		
		int avg;
		
		avg=(sum/5);
		
		System.out.println("Average Marks: "+avg);
		
			

	}

}
