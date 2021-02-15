package exercise1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int choice;
	    int numberOfCustomers = 0;
	    boolean endProgram = false;
	    String bankName;   
	    System.out.print("Name of bank: ");
	    bankName = input.next();
	    Bank bank = new Bank(bankName);
	    
		String accountId;

	    SavingsAccount acc = new SavingsAccount();  
	    Customer[] customer = bank.getCustomer();            

	    do {        
	        System.out.println("    " + bank.getBankname() + "\n");
	        System.out.println("    1. See balance                          ");
	        System.out.println("    2. Withdraw                             ");
	        System.out.println("    3. Deposit                              ");
	        System.out.println("    4. Add new customer                     ");
	        System.out.println("    5. Show customers                       ");
	        System.out.println("    0. Exit                                 ");            

	        choice = input.nextInt();

	        switch(choice) {

	            case 1:  
	            	
	            	
	                break;


	            case 2: 
	                //code
	                break;


	            case 3: 
	                //code
	                break;


	            case 4: //Add customer                   
	                System.out.println("Choose account: ");
	                System.out.println("1. Savings account");
	                System.out.println("2. Credit account");
	                choice = input.nextInt();
	                switch(choice) {

	                    case 1:     //Create savings account
	                        System.out.print("Enter amount to deposit: ");
	                        double amount = input.nextDouble();
	                        System.out.println("Account number is: " + numberOfCustomers);
	                        SavingsAccount savingsAccount = new SavingsAccount(amount, String.valueOf(numberOfCustomers));                    
	                        System.out.print("First name: ");
	                        String firstName = input.next();
	                        System.out.print("Last name: ");
	                        String lastName = input.next();
	                        System.out.print("Customer number: ");
	                        String pnumber = input.next();

	                        Customer newCustomer = new Customer(firstName, lastName, pnumber, savingsAccount);
	                        customer[numberOfCustomers] = newCustomer;
	                        numberOfCustomers++;              

	                        break;

	                    case 2:     //Create credit account
	                        System.out.print("Enter amount to deposit: ");
	                        double amount1 = input.nextDouble();
	                        System.out.println("Account number is: " + numberOfCustomers);
	                        CurrentAccount creditAccount = new CurrentAccount(amount1, String.valueOf(numberOfCustomers));                    
	                        System.out.print("First name: ");
	                        String firstName1 = input.next();
	                        System.out.print("Last name: ");
	                        String lastName1 = input.next();
	                        System.out.print("Customer number: ");
	                        String pnumber1 = input.next();

	                        Customer newCustomer1 = new Customer(firstName1, lastName1, pnumber1, creditAccount);
	                        customer[numberOfCustomers] = newCustomer1;
	                        numberOfCustomers++;                    

	                        break;                            
	                }
	                break;


	            case 6: 
	                //code
	                break;

	            case 0: 
	                //code
	                break;
	        }
	    }while (!endProgram);
	}

}
