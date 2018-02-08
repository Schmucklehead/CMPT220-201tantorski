import java.util.Scanner;

public class Problem5_16 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter INT: ");
		int num = input.nextInt();
		int factor = 2;  


		while (num / factor != 1) 
		{
			if (num % factor  == 0) 
			{
				System.out.print(factor + ", ");
				num /= factor; 
			}
			else
				factor++; 
		}
		System.out.println(num);
	}

}
