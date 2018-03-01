import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	// Default Constructor
	Account() 
	{
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date(); 
	}
	//this makes personal account
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}
	//sets your id as your id
	public void setId(int newId) {
		id = newId;
	}
	//gets your current balance
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	//setting the rate of interest
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	//all of these methods allow the main to call them in order that they are displayed on the console
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public String getDateCreated() {
		return dateCreated.toString();
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
	public void deposit(double amount) {
		balance += amount;
	}
}