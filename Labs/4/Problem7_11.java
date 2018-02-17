import java.util.Scanner;

public class Problem7_11 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		double[] num = new double[10]; 
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < num.length; i++)
			num[i] = input.nextDouble();


		System.out.println("Mean: " + mean(num));
		System.out.println("SD: " + dev(num));
	}

	
	public static double dev(double[] numbers) {
		double count = 0;
		double mean = mean(numbers);
		for (int i=0; i<numbers.length;i++)
		{
		    count = count + Math.pow(numbers[i] - mean, 2);
		}
		return Math.sqrt(count/ (numbers.length-1));
		
	}

	
	public static double mean(double[] m) {
	    double sum = 0;
	    for (int i = 0; i < m.length; i++) {
	        sum += m[i];
	    }
	    return sum / m.length;
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




