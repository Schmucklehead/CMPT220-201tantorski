
public class Problem5_13 {
	public static void main(String[] args) {
		int num = 0; 	
		
		while (Math.pow(num + 1, 3) < 12000) 
		{
			num++; 		
		}
		System.out.println("Biggest number less than 12,000: " + num);
	}

}

