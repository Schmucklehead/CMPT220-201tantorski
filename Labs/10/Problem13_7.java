public class Problem13_7 {
	
	public static void main(String[] args) {
		
		GeometricObject[] squares = {new Square(4.5), new Square(14), new Square(8.2), new Square(12), new Square(10)};

		
		for (int i = 0; i < squares.length; i++) {
			//Index + 1 for order
		 	System.out.println("\nSquare #" + (i + 1));
		 	//Area of squares
		 	System.out.println("Area: " + squares[i].getArea());
		 	//How to color it
		 	System.out.println("How to color: " + ((Square)squares[i]).howToColor());
		 } 
	}
}