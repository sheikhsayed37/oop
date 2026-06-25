class BankAccount {

    // Private fields
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Setter methods
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter methods
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to display account info
    public void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class bankaccount{
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.setAccountHolder("SHEIKH MOHAMMED SAYED ALI");
        acc.setAccountNumber("E253045");
        acc.setBalance(50000);

        acc.showAccountInfo();
    }
}