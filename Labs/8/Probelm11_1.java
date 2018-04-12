import java.util.Scanner;
public class Probelm11_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//getting user sides
		System.out.print("Sides: ");
		double side1 = input.nextDouble();		
		double side2 = input.nextDouble();		
		double side3 = input.nextDouble();

		//what color the user wants 
		System.out.print("Color: ");
		String color = input.next();

		//see if triangle is filled or not
		System.out.print("Filled: (True/False)");
		boolean filled = input.nextBoolean();

		// triangle object
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		//what the user sees after inputs
		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		if(triangle.isFilled())
			System.out.println("Triangle is Filled");
		else
			System.out.println("Triangle NOT is Filled");
			
	}
}


