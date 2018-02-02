import java.util.Scanner;

public class Problem4_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt 
		System.out.print("Enter employee’s name: ");
		String name = input.next();	
		
		System.out.print("Enter number of hours worked in a week: ");
		double hourWork = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double hourPay = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double federalTax = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTax = input.nextDouble();

		// Display payroll statement
		double total, federal, state, totalDeduct;
		System.out.print("Employee Name: " + name);
		System.out.print("\nHours Worked: " + hourWork);
		System.out.print("\nPay Rate: $" + hourPay +"\nGross Pay: $" + (total = hourWork * hourPay));
     	System.out.print("\nDeductions:\n\tFederal Witholding " + (federalTax) * 100 + "%"+  ": $" +(federal = total * federalTax));
		System.out.print("\n\tState Witholding "+ (stateTax) * 100 + "%"+  ": $" +(state = total * stateTax));
		System.out.print("\n\tTotal Deduction: $" + (totalDeduct = federal + state));
		System.out.print("\nNet Pay: $" + (total - totalDeduct));
	}

}
