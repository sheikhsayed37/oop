interface ATMService {

    void withdraw();

    void deposit();

    void checkBalance();
}

class DBBL implements ATMService {

    @Override
    public void withdraw() {
        System.out.println("Withdraw money from DBBL");
    }

    @Override
    public void deposit() {
        System.out.println("Deposit money to DBBL");
    }

    @Override
    public void checkBalance() {
        System.out.println("Check balance in DBBL");
    }
}

public class abstract2 {
    public static void main(String[] args) {

        DBBL account = new DBBL();

        account.withdraw();
        account.deposit();
        account.checkBalance();
    }
}