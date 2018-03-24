import java.util.Scanner;
//Used the same code from Lab3 but changed it to work with StackOfIntegers 
public class Problem10_5 {

	public static void main(String[] args) {
			//get input from user
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a positive integer: ");
			int number = input.nextInt();

			StackOfIntegers stack = new StackOfIntegers();
			//2 is the lowest factor it can be therefore it goes up by one if not divided by 2
			int denom = 2;
			while (denom <= number) {
				if (number % denom == 0) {
					
					stack.indexToTop(denom);
				
					number /= denom;
				} else {
					
					denom++;
				}
			}
			
			while (!stack.empty()) {
				System.out.print(stack.remove() + ", ");
	

	}
  } 

}
