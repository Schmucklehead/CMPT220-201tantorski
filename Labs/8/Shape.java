
public class Shape {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	//constructor
	public Shape() {
		dateCreated = new java.util.Date();
	}

	//wheter it is color and filled or not
	public Shape(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	//gets the color of shape
	public String getColor() {
		return color;
	}
	//setter for color
	public void setColor(String color) {
		this.color = color;
	}

	//fills shape
	public boolean isFilled() {
		return filled;
	}
	//setter of filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	//gets date made
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	
	public String toString() {
		return "This shape was created on " + dateCreated + "\nColor: " + color +  " and filled: " + filled;
	}
}


