
public class Circle2D {
	
	private double x; 
	private double y; 
	private double radius;

	
	Circle2D() 
	{
		this(0, 0, 1);
	}

	Circle2D(double x, double y, double radius) 
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	//getting x and y and radius
	public double getX() 
	{
		return x;
	}
	public double getY() 
	{
		return y;
	}
	public double getRadius() 
	{
		return radius;
	}
	//calc area
	public double getArea() 
	{
		return Math.PI * Math.pow(radius, 2);
	}

	//calc per
	public double getPerimeter() 
	{
		return 2 * Math.PI * radius;
	}

	//this is to see whether a point is in the circle
	public boolean contains(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2))  < radius;
	}

	public boolean contains(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2)) <= radius - circle.getRadius();
	}

	//to see if it overlaps the current circle
	public boolean overlaps(Circle2D circle) {
		//seeing if true
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2))  <= radius + circle.getRadius();
	}

}
