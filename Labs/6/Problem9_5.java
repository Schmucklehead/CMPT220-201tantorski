import java.util.GregorianCalendar;

public class Problem9_5 {

	public static void main(String[] args) {
		
		GregorianCalendar calender = new GregorianCalendar();

		// this is for the current time
		System.out.print("The current date is: ");
		//using class
		System.out.println(calender.get(calender.MONTH) + "/" + calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));

		//set in instructions 
		calender.setTimeInMillis(1234567898765L);

		// Elapsed since Jan/1/1970 
		System.out.print("\nElapsed time since January 1, 1970: ");
		System.out.println(calender.get(calender.MONTH) + "/" + calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));
		

	}

}
