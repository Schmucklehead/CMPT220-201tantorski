import java.util.Scanner;

public class AvgAccel {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter Value1, Value2 and time: ");
		double value1 = userInput.nextDouble();
		double value2 = userInput.nextDouble();
		double time = userInput.nextDouble();
		
		
		double avgAccel = (value2 - value1)/time;
		
		System.out.println("Average Acceleration: " + avgAccel);

	}

}
