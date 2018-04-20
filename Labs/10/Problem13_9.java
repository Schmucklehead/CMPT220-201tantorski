public class Problem13_9 {
	
	public static void main(String[] args) {
		//3 Circle objects
		Circle circle1 = new Circle(10, "white", false);
		Circle circle2 = new Circle(10, "black", false);
		Circle circle3 = new Circle(14, "red", false);

		//Radius
		System.out.println("Circle1 radius: " + circle1.getRadius());
		System.out.println("Circle2 radius: " + circle2.getRadius());
		System.out.println("Circle3 radius: " + circle3.getRadius());

		if(circle1.equals(circle2)){
			System.out.println("Circle1 is equal to Circle2");
		}		
		else
		{
			System.out.println("Circle1 is not equal to Circle2");
		}
		if(circle1.equals(circle3)){
			System.out.println("Circle1 is equal to Circle3");
		}		
		else
		{
			System.out.println("Circle1 is not equal to Circle3");
		}

	}
}