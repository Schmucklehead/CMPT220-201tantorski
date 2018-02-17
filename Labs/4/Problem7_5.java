import java.util.Scanner;

public class Problem7_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] number = new int[10]; 
		 				
		int dnum = 0;			

		
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			int num = input.nextInt();

			
			if (Valid(number, num)) 
			{
				number[dnum] = num;
				dnum++;	
			}
		}
		
		System.out.println("# of Distinct Numbers: " + dnum);
		System.out.print("Distinct Numbers:");
		for (int i = 0; i < number.length; i++) 
		{
			if (number[i] > 0)
				System.out.print(" " + number[i]);
		}
		System.out.println();
	}

	public static boolean Valid(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) // ASK about this
				return false;
		}
		return true;//do nothing if not
	}

}
