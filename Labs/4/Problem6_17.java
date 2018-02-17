import java.util.Scanner;

public class Problem6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter n: ");
		int userNum = input.nextInt();
		nbynmatrix(userNum);
		
	}

	
	public static void nbynmatrix(int value) {
		for (int rows = 0; rows < value; rows++) {
			for (int cols = 0; cols < value; cols ++) 
			{
				System.out.print((int)(Math.random() * 2));	
			}
		System.out.println(); //make a new row after getting 3 digits
		}	
		
	}


}
