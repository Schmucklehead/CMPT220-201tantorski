import java.util.Scanner;

public class Problem7_3 {

	public static void main(String[] args) {

		System.out.print("Enter Ints between 1 and 100: ");
		Scanner input = new Scanner(System.in);
		
		int[] num = new int[100]; 
		
		int numInput;
		int checker = 0;
		for(int i = 0; checker < 1; i++) {
			numInput = input.nextInt();
			if(numInput != 0 )
			{
				num[i] = numInput;
			}
			else
			{
				checker = 2;
			}
			
		countNum(num);
		}
		}
		
		public static void countNum(int[] array)
		{
		for(int j = 1; j<=100; j++) {
			int happens = 0;
			for(int i = 0; i < array.length - 1; i++) 
			{
				if(array[i] == j)
					happens++;
			}
			if(happens != 0)
				if(happens > 1)
					System.out.println(j + " happens " + happens + " times.");
				else
					System.out.println(j + " happens " + happens + " time.");
			
		}
	}
}
