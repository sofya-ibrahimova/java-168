package lesson25;

import Lesson28.Customer;

public class Lesson25 {
    public static void main(String[] args) {

        MyStack<Customer> myStack = new MyStack<>();
        Customer customer1 = new Customer("Sevda", 25, "123432");
        Customer customer2 = new Customer("Sofya", 27, "122432");
        Customer customer3 = new Customer("Aynur", 30, "322436");
        myStack.set(customer1);
        myStack.set(customer2);
        myStack.set(customer3);
        System.out.println(myStack.get());

    }
}
