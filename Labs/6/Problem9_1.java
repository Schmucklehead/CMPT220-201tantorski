
public class Problem9_1 {

	public static void main(String[] args) {
		//Make a 40 by 4 
		Rectangle rec1 = new Rectangle(4, 40);

		//Make a 3.5 by 35.9
		Rectangle rec2 = new Rectangle(3.5, 35.9);

		//Credentials for first rec
		System.out.println("\n Rectangle 1");
		System.out.println("-------------");
		System.out.println("Width:     " + rec1.width);
		System.out.println("Height:    " + rec1.height);
		System.out.println("Area:      " + rec1.getArea());
		System.out.println("Perimeter: " + rec1.getPerimeter());

		//Credentials for second rec
		System.out.println("\n Rectangle 2");
		System.out.println("-------------");
		System.out.println("Width:     " + rec2.width);
		System.out.println("Height:    " + rec2.height);
		System.out.println("Area:      " + rec2.getArea());
		System.out.println("Perimeter: " + rec2.getPerimeter());

	}

}
