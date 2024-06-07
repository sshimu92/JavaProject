package Examples;

public class Car_Test {

	public static void main(String[] args) {
		
		Car myCar= new Car();
		
		/*myCar.setModel("Audi Q7");
		String s=myCar.getModel();
		System.out.println(s);*/
		
		System.out.println(myCar.getModel());
		System.out.println(myCar.getColor());
		System.out.println(myCar.getDoor());
		System.out.println(myCar.getPrice());
		System.out.println(myCar.isAutomatic());
		System.out.println(myCar.isAwd());
		
		System.out.println("**************");
		myCar.setColor("Red");
		myCar.setDoor(4);
		myCar.setModel("Audi Q7");
		myCar.setPrice(42000);
		myCar.setAutomatic(false);
		myCar.setAwd(false);
		
		System.out.println("**************");
		System.out.println(myCar.getModel());
		System.out.println(myCar.getColor());
		System.out.println(myCar.getDoor());
		System.out.println(myCar.getPrice());
		System.out.println(myCar.isAutomatic());
		System.out.println(myCar.isAwd());
		
		
		
		
		
		
		
	}

}
