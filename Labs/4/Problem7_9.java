import java.util.Scanner;

public class Problem7_9 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		double[] num = new double[10]; 
		
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < num.length; i++) 
		{
			num[i] = input.nextDouble();
		}

		
		System.out.println("MIN NUM: " + min(num , 10));
	}

	
	public static double min(double[] num, int total) {
	
	int temp;  
	for (int i = 0; i < total; i++)   
	        {  
	            for (int j = i + 1; j < total; j++)   
	            {  
	                if (num[i] > num[j])   
	                {  
	                    temp = (int) num[i];  
	                    num[i] = num[j];  
	                    num[j] = temp;  
	                }  
	            }  
	        }  
	       return num[0];  
	}

}
