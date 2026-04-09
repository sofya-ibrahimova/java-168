package mentor.lesson3;

import java.io.BufferedWriter;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
//        Customer user1 = new Customer("Sofya", "Ibrahimova");
//
//        Order order = new Order(user1);
//
//        Book book1 = new Book("1984", "Orwell", 15);
//        Book book2 = new Book("Master i Marqarita", "Bulqakov", 12);
//
//        order.addBook(book1);
//        order.addBook(book2);
//
//        order.printOrderDetails();
//        System.out.println();
//        order.getTotaPrice();

        Scanner sc = new Scanner(System.in);
        System.out.println("1." + Meat.READ_MEAT + "\n2." + Meat.POULTRY + "\n3." + Meat.SEAFOOD);
        int number = sc.nextInt();
        Meat meat = null;
        switch (number) {
            case 1:
                meat = Meat.READ_MEAT;
                break;
            case 2:
                meat = Meat.POULTRY;
                break;
            case 3:
                meat = Meat.SEAFOOD;
                break;
        }
        System.out.println("weight:");
        int weight = sc.nextInt();
        if (weight > meat.getWeight() ){
            throw new MeatWeightException();
        }



    }
}
