import java.util.Scanner;

public class MentorLesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 2000;
        double sum = 0;
        while (balance > 0) {

            int out = sc.nextInt();
            if (out > balance) {
                System.out.println("yetersiz mebleg");
            }
            if (sum + out > 1500 &&  out <= balance) {
                sum += ((sum + out) - 1500) * 0.02 + (out - ((sum + out) - 1500)) + ((sum + out) - 1500);
                balance -= ((sum + out) - 1500) * 0.02 + (out - ((sum + out) - 1500)) +((sum + out) - 1500);
                System.out.println(balance >= 0 ? balance : "yetersiz mebleg");
            }
            if (sum + out < 1500) {
                sum += out;
                balance -= out;
                System.out.println(balance);
            }


        }


    }


}