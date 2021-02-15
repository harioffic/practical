package exercise1;

public class CurrentAccount extends Account {
	
 
    public CurrentAccount() {     
        super();
    }

    public CurrentAccount(double balance, String id) {  
        super(balance,id);
    }

    public void setBalance(double balance) {
    	this.balance=balance;
       //code
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


