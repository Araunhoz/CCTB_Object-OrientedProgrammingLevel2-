// Inherit Class BankAccount

class SavingsAccount extends BankAccount {
    
	private double interestRate;

    // Constructor with parameters balance and interestRate
    
    public SavingsAccount(double balance, double interestRate) {
    	
        super(balance);
        this.interestRate = interestRate;
        
    }

    // Override in the calculateInterest() method
    public double calculateInterest() {
    	
        return balance * (interestRate / 100);
        
    }
}
