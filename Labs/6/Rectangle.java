
public class Rectangle {
	double width;	
	double height;

	Rectangle() {
		width = 1;
		height = 1;
	} 

	//Constructor
	Rectangle(double width2, double height2) {
		width = width2;
		height = height2;
	}
	//Calculate perimeter
		double getPerimeter() {
			return 2 * (width + height);
	}

	//Calculation to get are
	double getArea() {
		return width * height; 
	}

	

}
