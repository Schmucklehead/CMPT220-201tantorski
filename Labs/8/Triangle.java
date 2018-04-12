public class Triangle extends Shape {
	private double side1;
	private double side2;
	private double side3;

	
	Triangle() {
		side1 = side2 = side3 = 1.0;
	}

	//constructor
	Triangle(double side1, double side2, double side3) { 
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea() {
		double num = (side1 + side2 + side3) / 2;
		return Math.sqrt(num * (num - side1) * (num - side2) * (num - side3));
	}
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}