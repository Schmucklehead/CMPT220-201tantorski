import java.util.Date;

public class Account 
{
	private int id;
	private double balance;
	private static double intRate;
	private Date dateCreated;

	//Constructors
	
	Account() 
	{
		this(0, 0); 
	}

	
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		intRate = 0;
		dateCreated = new Date();
	}

	// Mutator for methods
	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void setAnnualInterestRate(double annualInterestRate) {
		this.intRate = annualInterestRate;
	}

	// Access for the method methods
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return intRate;
	}
	public String getDateCreated() {
		return dateCreated.toString();
	}
	public double getMonthlyInterestRate() {
		return intRate / 12;
	}

	// Methods
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
	public void deposit(double amount) {
		balance += amount;
	}

	
	public String toString() {
		return "\nAccount ID: " + id + 
				"\nDate created: " + getDateCreated() + 
				"\nBalance: $" + String.format("%.2f", balance) /* this allows me to stop at the hundredths place*/ + 
				"\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
	}
}