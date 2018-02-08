
public class Problem5_5 {
	public static void main(String[] args) {
		
		final double PPKilo = 2.2;

		
		System.out.println("Kilograms    Pounds     |     Pounds      Kilograms");
		
		for (int i = 1, j = 20; i <= 199 && j <= 515; i += 2, j += 5) {
			
			System.out.printf("%-12d%7.1f", i, (i * PPKilo));
			System.out.print("     |     ");
			System.out.printf("%-9d%12.2f\n", j , (j / PPKilo));
		}
	}

}
