public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    
    public Account()
    {
        System.out.println("Empty Constructor called");
    }
    
    public Account(String number, double balance, String customerName,
            String customerEmailAddress, String customerPhoneNumber)
    {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
        System.out.println("Account constructor called");
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
      this("99999", 100.00, customerName, customerEmailAddress, customerPhoneNumber);
    }
    
    
    
    public void deposit(double depositAmount)
    {
        this.balance += depositAmount;
        System.out.println("Deposit of: " + depositAmount + " made. Now balance is: " + this.balance);
    }
    public void withdrawl(double withdrawlAmount)
    {
        if(this.balance - withdrawlAmount < 0)
        {
            System.out.println("Only " + balance + " available. Withdrawl not processed");    
        }
        else
        {
            this.balance -= withdrawlAmount;
            System.out.println("Withdrawl of " + withdrawlAmount + " processed. Remaining balance is: " + this.balance);
        }
    }
    
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    
    
}
