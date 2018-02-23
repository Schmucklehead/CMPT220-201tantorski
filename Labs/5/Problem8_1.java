import java.util.Scanner;

public class Problem8_1 {

	public static void main(String[] args) 
	{
		//Builds the matrix
		double[][] matrix = buildMax();
		for (int col = 0; col < matrix[0].length; col++) 
		{	
			System.out.println("Sum at " + col + " is " + total(matrix, col));
		}
			}

			//Basically builds the array that you input
			public static double[][] buildMax() 
			{
				
				Scanner input = new Scanner(System.in);
				int r = 3;
				int c = 4;
				double[][] newMax = new double[r][c];

				
				System.out.println("Print a matrix: ");
				for (int row = 0; row < newMax.length; row++)
					for (int col = 0; col < newMax[row].length; col++) 
						newMax[row][col] = input.nextDouble();
				return newMax;
			}

			
			public static double total(double[][] matrix, int col) {
				double total = 0;
				for (int row = 0; row < matrix.length; row++) {
					total = total + matrix[row][col];		
				}
				return total;
			}
	}


