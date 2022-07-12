import java.util.Scanner;

public class AreaofRectangle {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		
		rect1.take_input();
		
		Rectangle rect2 = new Rectangle();
		
		rect2.calculate_area(45, 78);
		
		

	}

}

class Rectangle{
	float l, b;
	
	void take_input() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length");
		l = s.nextFloat();
		System.out.println("Enter breadth");
		b = s.nextFloat();
		s.close();
		
		calculate_area(l,b);
		
	}
	
	float calculate_area(float l, float b) {
		return l*b;
		
	}
}
