import java.util.Scanner;

public class Problem5_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int pos = 0; 	
		int neg = 0; 	
		int count = 0;			
		double total = 0;		
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int number = input.nextInt();

		if (number == 0) 
		{	
			System.out.println("No numbers are entered except 0");
			System.exit(1);
		}

		while (number != 0)
		{
			if (number > 0)
				pos++;	
			else
				neg++;	
			total += number;
			count++;				
			number = input.nextInt();
		}

	
		double avg = total / count;

		System.out.println(
			"The number of positive is " + pos +
			"\nThe number of negatives is " + neg +
			"\nThe total is total " + total +
			"\nThe average is " + avg);
	}

}
