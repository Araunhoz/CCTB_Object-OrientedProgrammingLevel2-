class CheckingAccount extends BankAccount {

    // Constructor with parameter balance
	
    public CheckingAccount(double balance) {
    	//Take the attributes of parent Class
        super(balance);
        
    }

    // Override in the calculateInterest() method
    public double calculateInterest() {
    	
        // Checking the accounts 
        return 0;
    
    }
}
