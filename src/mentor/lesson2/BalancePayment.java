package mentor.lesson2;

public class BalancePayment extends PaymentMethod {
    double balance = 100;

    @Override
    public boolean pay(double amount) {
        if (balance < amount) {
            System.out.println("Balans kifayət etmir");
            return false;
        }
        balance -= amount;
        System.out.println("balans: " + balance);
        return false;
    }
}
