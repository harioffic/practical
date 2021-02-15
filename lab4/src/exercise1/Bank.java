package exercise1;

public class Bank {
    String bankName;
    private Customer[] customers = new Customer[100];

    Bank(String bankName) {
        this.bankName = bankName;
    }

    public Customer[] getCustomer() {
        return customers;
    }  

   public String getBankname() {
       return bankName;
   }


}
