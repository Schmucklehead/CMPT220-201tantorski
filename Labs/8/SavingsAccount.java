public class SavingsAccount extends Account {
	
	//Constructor
	public SavingsAccount() {
		super();
	}

	
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	//withdraw method
	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println(
				"You cannot do that!");
	}
}