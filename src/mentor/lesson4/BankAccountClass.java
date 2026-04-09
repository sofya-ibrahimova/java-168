package mentor.lesson4;

public class BankAccountClass {

    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw() {
        if (balance > 300) {
            balance -= 300;
        }
    }

    public synchronized void deposit() {
        balance += 500;
    }

}
