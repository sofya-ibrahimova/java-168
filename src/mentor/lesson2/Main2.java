package mentor.lesson2;

public class Main2 {
    public static void main(String[] args) {
        PaymentMethod ccp = new CreditCardPayment();
        PaymentMethod bp = new BalancePayment();
        PaymentMethod cp = new CouponPayment();
        PaymentMethod[] pm = {ccp, bp, cp};

        for (int i = 0; i < pm.length; i++) {
            pm[i].pay(40);
        }

    }
}
