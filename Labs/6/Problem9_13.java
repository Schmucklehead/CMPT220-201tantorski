import java.util.Scanner;

public class Problem9_13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of ROW & COL: ");
		int rows = input.nextInt();
		int cols = input.nextInt();

		// Create matrix
		double[][] array = new double[rows][cols]; 
		System.out.println("Array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}

		// Get and instance of Location
		Location max = locateLargestNum(array);

		// Display the location of the largest element in the array
		System.out.println("The location of the largest element is " + max.maxValue + " at: " + max.row + ", " + max.column + "");
	}

	//find the location with largest number
		public static Location locateLargestNum(double[][] num) {
			return new Location(num);
		}

	

}


