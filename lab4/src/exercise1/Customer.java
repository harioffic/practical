package exercise1;

import java.util.Scanner;

public class Customer {
	private String firstName;
    private String lastName;
    private String number;

    private SavingsAccount account = new SavingsAccount();
    private CurrentAccount cAccount = new CurrentAccount();

    Customer(String firstName, String lastName, String number, SavingsAccount account) {   
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.number = number;
	        this.account = account;
	     }

	    Customer(String firstName, String lastName, String number, CurrentAccount cAccount) {   
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.number = number;
	        this.cAccount = cAccount;
	    }

	    public SavingsAccount getAccount() {
	        return account;
	    }

	    public CurrentAccount getCurrentAccount() {
	        return cAccount;
	        
	    
	    }      
}
	

