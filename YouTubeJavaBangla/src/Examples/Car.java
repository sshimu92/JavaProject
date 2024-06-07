package Examples;

public class Car {

	private String model= "BMW XS";
	private String color= "Black";
	
	private int price= 75000;
	private int door= 2;
	
	private boolean awd= true;
	private boolean automatic= true;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public boolean isAwd() {
		return awd;
	}
	public void setAwd(boolean awd) {
		this.awd = awd;
	}
	public boolean isAutomatic() {
		return automatic;
	}
	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}
	
	/*setters: Method with no return means void.
	public void setModel(String s) {
		model= s;*/
	
	/*Getters: Method with returns
	public String getModel() {
		return model;*/
	
	
	//All this process called: Encapsulation.
	
	
	
}

