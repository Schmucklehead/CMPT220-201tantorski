//2.1
import java.util.Scanner;

public class CelToFahr {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		//Prompt User
		System.out.print("Enter a Celsius degree: ");
		double cel = userInput.nextDouble();
		double fahr = ((9.0/5.0) * cel) + 32;
		System.out.println(cel + " Celsius is: " + fahr + " Fahrenheit.");
		
		
		
		
		
		
		
	}

}
