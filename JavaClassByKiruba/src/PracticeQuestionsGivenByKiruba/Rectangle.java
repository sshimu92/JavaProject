package PracticeQuestionsGivenByKiruba;

public class Rectangle {

    int length;
    int width;
    
    public Rectangle(int length, int width) {
    	
      this.length= length;
      this.width= width;
    
    }

    public void  calculateArea() {
    	
    	int calculateArea= (length * width);
    	
    	System.out.println("Area of the rectangle: "+ calculateArea);
    }

    public static void main(String[] args) {
    	
    	Rectangle rectangle= new Rectangle(12, 10);
    	
    	rectangle.calculateArea();
    }
}
