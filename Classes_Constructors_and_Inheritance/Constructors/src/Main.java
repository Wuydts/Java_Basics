/*
    Create a new class for a bank account
    Create fields for the account number, balance, c. name, email and phone.

    create getters and setters for each field
    create two additional methods:
        1) Allow the customer to deposite funds 
        2) Allow the customer to withdraw funds
            Should not allow withdraw if insufficent funds.

    
      
 */

public class Main {
    public static void main(String[] args)
    {
        Account myAccount = new Account();
        myAccount.setNumber("12345");
        myAccount.setBalance(0.00);
        myAccount.setCustomerName("Christopher ");
        myAccount.setCustomerEmailAddress("Thisisfake@fakemail.com");
        myAccount.setCustomerPhoneNumber("(415)415 - 4115");
        myAccount.withdrawl(100.00);
        myAccount.deposit(1000.41);
        myAccount.withdrawl(21);
        
        Account bob = new Account("123456", 0.00, "Bob Brown", "anotherfakeemail@fakemail.com", "(415)415 - 4151");
        System.out.println("bob's Account: " + bob.getNumber() + " Bob's balance " + bob.getBalance());
        
        Account tim = new Account("Tim Man", "timeemail.com", "415-444-4444");
        System.out.println(tim.getNumber() + " name " + tim.getCustomerName());
        
    }
}
