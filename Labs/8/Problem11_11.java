import java.util.ArrayList;
import java.util.Scanner;

public class Problem11_11 {
	
	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);

		//ArrayList of Ints
		ArrayList<Integer> list = new ArrayList<Integer>();

		
		System.out.print("5 NUMBERS: ");
			for (int i = 0; i < 5; i++) {
				list.add(input.nextInt());
		}
		sort(list);
		System.out.println(list.toString());
	}

	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);		
	}
}


