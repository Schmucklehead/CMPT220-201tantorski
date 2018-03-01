
public class Problem9_3 {

	public static void main(String[] args) {
		// Create a Date object
		//Put it in the main bc it doesnt work outside of main and does here
		java.util.Date date = new java.util.Date();

		
		System.out.println("\nThe dates and times for elapsed times 10000, "  +
			"100000, 1000000, 10000000,\n100000000, 1000000000, 10000000000," +
			" and 100000000000, respectively");
		//basically used a for loop to go through each element going up by multiples of 10 until 1e11
		for (long i = 10000; i <= 1e11; i = i* 10) {
			//used the  .setTime part of the date library
			date.setTime(i);
			//used .toString function
			System.out.println(date.toString());
		}
		

	}

}
