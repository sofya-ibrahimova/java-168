package mentor.lesson7.task25;

public class Task25 {
    public static void main(String[] args) {

DiscountCalculator discountCalculator1 = discount -> discount - 0.1 * discount;
DiscountCalculator discountCalculator2 = discount -> discount - 0.2 * discount;
DiscountCalculator discountCalculator3 = discount -> discount - 50;
        System.out.println(discountCalculator1.apply(100));
        System.out.println(discountCalculator2.apply(100));
        System.out.println(discountCalculator3.apply(100));

    }
}
