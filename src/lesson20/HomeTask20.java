package lesson20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeTask20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerProcess customerProcess = new CustomerProcess();
        a:
        while (true) {
            System.out.println("add -1\nprintAll-2\nupdate user -3\ndelete-4\nany other number for exit");
            int number = 0;
            try {
                number = sc.nextInt();   //??
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!");
                sc.nextLine();
                continue;
            }
            switch (number) {
                case 1:
                    try {
                        customerProcess.addCustomer();
                    } catch (InvalidInputException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    customerProcess.printAllCustomers();
                    break;
                case 3:
                    try {
                        customerProcess.updateCustomer();
                    } catch (InvalidInputException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    customerProcess.deleteCustomer();
                    break;
                default:
                    break a;
            }
        }
        System.out.println();

    }
}
