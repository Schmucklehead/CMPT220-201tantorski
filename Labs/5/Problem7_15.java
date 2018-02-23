import java.util.Scanner;

public class Problem7_15 {
	public static void main(String[] args) {

	System.out.println("Enter 10 numbers: ");
	Scanner input = new Scanner(System.in);
	
	//array with 10 elements
	int[] arrayOne = new int[10];
	{
	
	for (int i = 0; i < arrayOne.length; i++) 
	{
		arrayOne[i] = input.nextInt();
	}
	int [] newArray = eliminateDuplicates(arrayOne);
	System.out.print("The distinct numbers are: ");
	for (int i = 0; i < newArray.length; i++) {
		System.out.print(" " + newArray[i]);
	}
	}
}
	public static int[] eliminateDuplicates(int[] list) {
		//that way you just have to write length not list.length
		int length = list.length;
		
	//Nested for loop
		for (int i = 0; i < length; i++) 
		{
			for (int j = i + 1; j < length; j++) 
			{//comparing the two different indexs of the list
				if (list[i] == list[j])
				{
					for (int x = j + 1; x < length; x++) 
					{
						list[j] = list[x];
						j++;
					}
				length--;
				j--;
				}
			}
		}
		//this array gives the length 
		int[] arrayTwo = new int[length];
		for(int i = 0; i < length; i++) {
			arrayTwo[i] = list[i];
		}
		return arrayTwo;
		}
	}

	