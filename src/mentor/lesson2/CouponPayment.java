package mentor.lesson2;

public class CouponPayment extends PaymentMethod {
    double coupon = 50;

    @Override
    public boolean pay(double amount) {
        if (coupon < amount) {
            System.out.println("Kupon kifayət etmir");
            return false;
        }
        coupon -= amount;
        System.out.println("Kupon: " + coupon);
        return true;
    }
}
