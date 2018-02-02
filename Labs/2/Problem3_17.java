import java.util.Scanner;

public class Problem3_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		int comp = (int)(Math.random() * 3);

		
		System.out.print("Scissor:0, Rock:1, Paper:2 : ");
		int userInput = input.nextInt();

		System.out.print("The computer is ");
		switch (comp)
		{
			case 0: System.out.print("Scissor."); break;
			case 1: System.out.print("Rock."); break;
			case 2: System.out.print("Paper.");
		}

		System.out.print(" You are ");
		switch (userInput)
		{
			case 0: System.out.print("Scissor"); break;
			case 1: System.out.print("Rock"); break;
			case 2: System.out.print("Paper");
		}

		if (comp == userInput)
			System.out.println(" too. It is a draw");
		else
		{
			boolean win = (userInput == 0 && comp == 2) || (userInput == 1 && comp == 0) || (userInput == 2 && comp == 1);
			if (win)
				System.out.println(". You won");
			else
				System.out.println(". You lose");
		}
	}

}
