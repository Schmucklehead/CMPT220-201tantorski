import java.util.Scanner;

public class Problem7_19 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		//enter in  a list
		System.out.print("LIST: ");
		int inter = input.nextInt();
		int[] newlist = new int[inter];
		for (int i = 0; i < newlist.length; i++)
			newlist[i] = input.nextInt();
		System.out.println("The list has " + newlist.length + " integers");

		if(isSorted(newlist))
			System.out.println( "The list is already sorted");
		else
			System.out.println( "The list is not sorted");
	}


	public static boolean isSorted(int[] num) 
	{
		for (int i = 0; i < num.length - 1; i++) 
		{
			if (num[i] > num[i + 1])
				return false;
		}
		return true;
	}

	}


