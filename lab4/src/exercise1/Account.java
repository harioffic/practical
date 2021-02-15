package exercise1;

public abstract class Account {
	 protected double balance = 0;
	    protected String accountId;

	   public Account() {} 
	   public Account(double bal, String id) {  
	       if (balance >= 500) {
	           balance = bal;
	       }
	       else {
	           balance = 0;
	       }
	       accountId = id;
	   }

	   public abstract void deposit(double amount); 

	   public abstract void withdraw(double amount);

	  
}
