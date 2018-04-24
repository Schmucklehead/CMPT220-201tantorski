import java.util.Scanner;

public class Problem18_17 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a list of characters in one line followed by desired letter: ");
		String string = input.nextLine();
		char[] chrs = new char[string.length() - 1];
		
		for (int i = 0; i < chrs.length; i++)
			chrs[i] = string.charAt(i);
		char ch = string.charAt(string.length() - 1);

		System.out.println("The character \"" + ch + "\" occurs " + count(chrs, ch) + " times in the list \"" + string.substring(0, string.length() - 1) + "\".");
	}
	public static int count(char[] chars, char ch) {
		return count(chars, ch, chars.length - 1);
	}
	public static int count(char[] chars, char ch, int high) {
		if (high < 0) 
			return 0;
		else if (chars[high] == ch) 
			return 1 + count(chars, ch, high - 1); 
		else
			return count(chars, ch, high - 1); 
	}
}