//2.5
import java.util.Scanner;

public class Gratuity {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter Subtotal and Rate: ");
		double subtotal = userInput.nextDouble();
		double rate = userInput.nextDouble();
		
		double tip = (rate/100) * subtotal;
		double total = subtotal + tip;
		
		System.out.println("Gradiuty: " + tip + " and the total is $" + total + ".");
		

	}

}
