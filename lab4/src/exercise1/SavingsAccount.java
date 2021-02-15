package exercise1;

public class SavingsAccount extends Account {
	
	    

	    private double deposit;
		private double withdraw;

		public SavingsAccount() {      
	        super();
	    }

	    public SavingsAccount(double balance, String id) {   
	        super(balance,id);
	    }


	    public void setBalance(double balance) {
	       this.balance=balance;
	    }

	    @Override
	    public void deposit(double amount) {
	    	this.deposit(amount);
	    }

	    @Override
	    public void withdraw(double amount) {
	    	this.withdraw(amount);
	    
	    }

	 
}
