package Constructor;

public class Constructors { 
	
	String name;
	
	//Constructors is a special kind of method to initialize object. 
	//Constructors uses when the object and classes are created.
	//To set the initial of the object.
	//It should not have return type as methods.
	//It is mainly use for initializing for data members.
	//It should have same name as class name.
	//it's not for return anything it is mainly for initializing for data members.
	
	  Constructors(String n){
		
		  name= n;
		  System.out.println("The Name is: "+name); 
	  }
	
    public static void main(String[] args) {
	 
	  //Constructor is involved while creating the object
	  Constructors c= new Constructors("Mike");
	  
	   
	  
  }	

}
