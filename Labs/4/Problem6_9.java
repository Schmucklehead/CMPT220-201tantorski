
public class Problem6_9 {
	public static void main(String[] args) {
		double meters = 20.0;
		System.out.printf("%-10s%10s | %-10s%10s\n", "Feet" , "Meters" , "Meters", "Feet");
		for( double feet = 1.0; feet <=10.0; feet++) 
			//Tried to do nested for loop by it would go through each meter 10 times for each foot
		{
			System.out.printf("%-10s%10s | %-10s%10s\n", feet , convertM(feet) , meters, convertF(meters));
			meters = meters + 5;
		}
		
	}
	public static double convertM(double feet) {
		return feet * 0.305;
	}
	public static double convertF(double meters) {
		return meters * 3.279;
	}

}
