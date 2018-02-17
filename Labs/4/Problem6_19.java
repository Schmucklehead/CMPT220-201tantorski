import java.util.Scanner;

public class Problem6_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		
		System.out.print("3 Sides:");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		
		
		if(isValid(s1,s2,s3)) 
			System.out.println("The area of the triangle is " + area(s1, s2, s3));
		else
			System.out.print("Invalid!");		
	}

	
	public static boolean isValid(double s1, double s2, double s3) 
	{
		return (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1);	 
	}

	
	public static double area(double s1, double s2, double s3) 
	{
		double s = (s1 + s2 + s3) / 2;
		return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
	}

}
