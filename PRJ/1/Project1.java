import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //get user input
		
		int num = input.nextInt(); //Getting user input / Smaller paper size
		int []numOfSheets =  new int[num]; //Creating new array for numOfSheets
		
		for(int i = 1; i < num; i++) //Going through each input and adding to the array
		{
			numOfSheets[i] = input.nextInt();
		}
		
		// Tell how much tape you need
	    double[] tape = new double[num];
	    for(int i = 1; i< num; i++) { //loop thru each index
	    	tape[i] = Math.pow(2, ((double)(-1 - i * 2)) / 4.0); // the eqaution given
	    }
	    
	    double tapeUsed = 0;//the total amount used at the end 
	    int nextPage = 1;//next size to add to a1
	    for (int i = 0; i < num; i++) { // go thru each element
	      
	      tapeUsed += tape[i] * ((double)(nextPage / 2));
	     
	      if (numOfSheets[i] >= nextPage) 
	      {
	    	  	nextPage = 0;
	        break;//if it works breakout of the loop
	      
	      //need more pgs
	      } else
	    	  nextPage = (nextPage - numOfSheets[i]) * 2;
	    }
	
	    // Output
	    if (nextPage > 0)//looks to see if next page is bigger than 0
	      System.out.println("impossible");
	    else
	      System.out.println(tapeUsed);
		
	  }
}


