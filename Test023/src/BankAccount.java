abstract class BankAccount {
	
	//Attribute 
    protected double balance;

    // The Constructor with parameter balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Abstract method
    public abstract double calculateInterest();
    
}
