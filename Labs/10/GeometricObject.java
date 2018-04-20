public abstract class GeometricObject {
	
	private String color = "blue";
	private boolean filled;
	private java.util.Date dateCreated;

	//Constructor
	 GeometricObject() {
		dateCreated = new java.util.Date();
	}

	//Constructor with Data
	 GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "Created on " + dateCreated + "\nColor: " + color +
			" and Filled: " + filled;
	}

	public abstract  double getArea();

	public abstract  double getPerimeter();

}