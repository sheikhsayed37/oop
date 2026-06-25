class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    // Static Variable
    static String bankName = "Sonali Bank";

    // Constructor
    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Static Method
    
    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    // Display Method
    void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

public class bank {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(
                "101", "Sayed", 50000);

        BankAccount acc2 = new BankAccount(
                "102", "Rahim", 75000);

        BankAccount.showBankName();

        System.out.println("\nAccount 1:");
        acc1.displayInfo();

        System.out.println("Account 2:");
        acc2.displayInfo();
    }
}