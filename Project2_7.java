import java.util.Scanner;

public class Project2_7 {
	
	public static void main(String[] ars) {
		Scanner input = new Scanner(System.in);
		
		//Prompt User
		System.out.print("Enter a number of minutes: ");
		long minutes = input.nextLong(); 
		
		//Calculate Year
		long years = minutes / (365*24*60);
		long days = minutes % (365*24*60) / (24*60);
		
		System.out.print(minutes + " minutes is " + years + " years and "+ days + " days.");
		
	}

}
