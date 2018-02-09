
public class Problem6_1 {
	
	public static void main(String[] args) {
		
		final int numOfPent = 100; 
		final int numLine = 10; 

		
		System.out.println("The first 100 pentagonal numbers, ten per line: ");
		for (int i=1; i <= numOfPent; i++) 
		{
			if (i % numLine == 0) 
				System.out.printf("%7d\n", getPentagonalNumber(i));
			else
				System.out.printf("%7d", getPentagonalNumber(i));
		}
	}

	public static int getPentagonalNumber(int n) 
	{
		return (n * (3 * n - 1)) / 2;
	}

}
