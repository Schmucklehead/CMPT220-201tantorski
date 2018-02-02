import java.util.Scanner;

public class Problem4_9 {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// Prompt
		System.out.print("Enter a character: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		
		//Print out
		System.out.println("The Unicode for the character " + ch + " is " + (int)ch);
	}

}
