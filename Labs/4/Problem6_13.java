
public class Problem6_13 {
	public static void main(String[] args) {
		
		System.out.printf("%-10s%10s\n", "i" , "m(i)");
		System.out.println("\n--------------------------");
		double i;

		for ( i = 1.0; i <= 20.0; i++) 
		{
			System.out.printf("%-10.1f%10.2f\n",i, sum(i));
		}
	}
	public static double sum(double number) 
	{
		double sum = 0;
		double count;
		for (count = 1 ; count <= number; count++) 
		{
			sum = sum + count / (count + 1);
		}
		return sum;
	}
}


