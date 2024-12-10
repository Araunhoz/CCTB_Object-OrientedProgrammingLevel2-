import java.util.ArrayList;
import java.util.List;

public class InterestCalculator {

    public static void main(String[] args) {
    	
        // Create SavingsAccount and CheckingAccount objects
        SavingsAccount savingsAccount = new SavingsAccount(45000, 5.5); 
        CheckingAccount checkingAccount = new CheckingAccount(48000);   

        // Create a ArrayList of type BankAccount
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(savingsAccount);
        accounts.add(checkingAccount);
        
        // Create a loop for to walk in accounts
        for (BankAccount account : accounts) {

        	double interest = account.calculateInterest();
            if (account instanceof SavingsAccount) {
            	
                System.out.printf("Savings Account: $%.2f%n", interest);
                
            } else if (account instanceof CheckingAccount) {
            	
                System.out.printf("Checking Account: $%.2f%n", interest);
                
            }
        }
    }
}
