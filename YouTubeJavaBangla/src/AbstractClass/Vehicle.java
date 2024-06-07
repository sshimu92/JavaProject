package AbstractClass;

public abstract class Vehicle {

    private String name;
    
    
    public Vehicle(String name) {
    	
    	this.name= name;
  
    }

    public abstract void drive();
    
    public String getName() {
    	return this.name;
    }

}
