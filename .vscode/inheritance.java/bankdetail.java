public class bankdetail {
    String accountNumber;
    String accountHolderName;
    double balance;

    bankdetail(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        bankdetail myAccount = new bankdetail("123456789", "Riya", 1000.50);
        myAccount.displayDetails();
    }
    
}
