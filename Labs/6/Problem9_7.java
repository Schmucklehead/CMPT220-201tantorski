
public class Problem9_7 {

	public static void main(String[] args) {
		
		//Made account
		Account account = new Account(1122, 20000);

		//Interest is 4.5%
		account.setAnnualInterestRate(4.5);

		//Withdraw 2,500$
		account.withdraw(2500);

		//Deposit 3,000$
		account.deposit(3000);

	
		System.out.println("\n          Account Statement");
		System.out.println("------------------------------------------");
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date created: " + account.getDateCreated());
		//Cut off because money is two place
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", account.getMonthlyInterest());
		

	}

}
