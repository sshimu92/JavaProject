package BasicsJava;

public class StudentMarksCalculator {

	public static void main(String[] args) {

		int[] marks = { 90, 80, 70, 60, 50 };

		int totalMarks = 0;

		for (int mark : marks) {

			totalMarks += mark;

		}

		int averageMarks = (int) totalMarks / marks.length;

		System.out.println("Total marks: " + totalMarks);

		System.out.println("Average marks: " + averageMarks);

	}

}


