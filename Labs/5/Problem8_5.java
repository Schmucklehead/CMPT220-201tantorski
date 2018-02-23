import java.util.Scanner;

public class Problem8_5 {

	public static void main(String[] args) {
		// Initialize two 3 x 3 matrices
				double[][] matrix1 = makeMax(1);
				double[][] matrix2 = makeMax(2);
				double[][] matrix3 = addMatrix(matrix1, matrix2);
				print(matrix1, matrix2, matrix3);
			}

			//Making the matrix for the main method to get
	public static double[][] makeMax(int num) {
			Scanner input = new Scanner(System.in);
			System.out.print("Matrix" + num + ": ");
			double[][] matrixCreate = new double[3][3];
				//going through each element of the matrix
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++)
						matrixCreate[i][j] = input.nextDouble();
				}
				return matrixCreate;
			}

			

			//this allows you to  see whats in each row
	public static void printER(double[][] matrix, int row) {	
				for (int i = 0; i < matrix[row].length; i++) {
					System.out.print(matrix[row][i] + " ");
					//add space to make them not be together
				}	
			}

			
	public static void print(double[][] matrix1, double[][] matrix2, double[][] matrix3) {
		System.out.println("The matrices are added as follows");
				//what the problem solution wants the output to say
				
			for (int i = 0; i < 3; i++) {
				printER(matrix1, i);
				if(i ==1)
					System.out.print("  +  " );
				else
					System.out.print("     ");
					printER(matrix2, i);
				if(i ==1)
						System.out.print("  =  " );
				else
					System.out.print("     ");
					printER(matrix3, i);
					System.out.println();
				}

	}
			//adding the new matrix
		public static double[][] addMatrix(double[][] a, double[][] b) {
				double[][] count = new double[3][3];
				//again going through each element of the matrix
				for (int i = 0; i < count.length; i++) {
					for (int j = 0; j < count[i].length; j++) {
						count[i][j] = a[i][j] + b[i][j];
					}
				}
				return count;
			}

}
