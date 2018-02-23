import java.util.Scanner;

public class Problem7_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner
		double[] nums = new double[10]; // Create array of length 10

		//Have user enter 10 digits
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextDouble();
		}

		//Output display on console
		System.out.println("Minimum Number: " + minNum(nums, 0));
	}

	
	
		public static double minNum(double[] num, int total) {
			
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


