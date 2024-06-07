package Inheritance;

public class Teacher1 extends Person1 {

	private String qualification;
	
	
	public String getQualification() {
		
		return qualification;
	}

	public void setQualification(String qualification) {
		
		this.qualification = qualification;
	}

	public void displayInformation() {
		
		System.out.println("Name: "+ getName());
		System.out.println("Age: "+ getAge());
		System.out.println("Qualification: "+ getQualification());
	}
	
}
