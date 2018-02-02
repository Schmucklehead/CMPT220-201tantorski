import java.util.Scanner;

public class Problem4_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a Social Security number
		System.out.print("Enter a SSN: ");
		String s = input.nextLine();

		
		boolean Valid = 
			(s.length() == 11) && 
			(Character.isDigit(s.charAt(0))) &&(Character.isDigit(s.charAt(1))) &&(Character.isDigit(s.charAt(2))) &&
			(s.charAt(3) == '-') &&
			(Character.isDigit(s.charAt(4))) &&(Character.isDigit(s.charAt(5)))&&
			(s.charAt(6) == '-') &&
			(Character.isDigit(s.charAt(7))) &&(Character.isDigit(s.charAt(8))) &&(Character.isDigit(s.charAt(9))) &&(Character.isDigit(s.charAt(10)));

		// Display result
		System.out.print(s + " is ");
		if(Valid)
			System.out.print("a valid Social Security Number");
		else
			System.out.print("not a valid Social Security Number");
			
			

		

	}

}
