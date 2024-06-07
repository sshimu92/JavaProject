package Inheritance;

public class Human {
      
	private String name;
	
	
	public Human(String name) {
		this.name=name;
	}
	
	public void eat() {
		
		System.out.println(this.name+" " +"is eating....");
	}
	
	public void swim() {
		
		System.out.println(this.name+ " " +"is swimming....");
	}

    public void sleep() {
    	
    	System.out.println(this.name+ " " +"is sleeping....");
    }

}
