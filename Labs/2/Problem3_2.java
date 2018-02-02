import java.util.Scanner;

public class Problem3_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Random numbers
		int v1 = (int)(Math.random() * 10);
		int v2 = (int)(Math.random() * 10);
		int v3 = (int)(Math.random() * 10);

		// Prompt 
		System.out.print("What's: " + v1 + " + " + v2 + " + " + v3 + "? ");
		int answer = input.nextInt();
		
		System.out.println(
			v1 + " + " + v2 + " + " + v3 + " = " + answer + " is " + (v1 + v2 + v3 == answer) + "!");
		
		

	}

}
