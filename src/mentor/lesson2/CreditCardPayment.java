package mentor.lesson2;

public class CreditCardPayment extends PaymentMethod {

    @Override
    public boolean pay(double amount) {
        System.out.println(amount + " AZN kredit kartı ilə ödənildi");
        return false;
    }
}
