
public class Problem11_3 {
		public static void main(String[] args) {
			// objects
			Account account = new Account(1234, 100000);
			SavingsAccount savings = new SavingsAccount(1991, 100000);
			CheckingAccount checking = new CheckingAccount(2108, 100000, -25);
			
			//Interset rate @ 5
			account.setAnnualInterestRate(5);
			savings.setAnnualInterestRate(5);
			checking.setAnnualInterestRate(5);

			
			account.withdraw(4000);
			savings.withdraw(4000);
			checking.withdraw(4000);

	
			account.deposit(5500);
			savings.deposit(5500);
			checking.deposit(5500);

			//print out values
			System.out.println(account.toString());
			System.out.println(savings.toString());
			System.out.println(checking.toString());
		}
	}


