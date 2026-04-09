package lesson29;

import java.util.*;
import java.util.function.Function;

public class Lesson29 {
    public static void main(String[] args) {

//        ProductService productService = new ProductService() {
//            @Override
//            public int test() {
//                return 5;
//            }
//        };

        Customer customer1 = new Customer("Ayla", 14);
        Customer customer2 = new Customer("Ayla", 12);
        Customer customer3 = new Customer("Zamiq", 10);
        Customer customer4 = new Customer("Ilayda", 16);
        Customer customer5 = new Customer("Asif", 14);

        List<Customer> list = new ArrayList<>();
        list.add(customer1);
        list.add(customer2);
        list.add(customer3);
        list.add(customer4);
        list.add(customer5);



//        Integer [] integers = {1,2,3,4,5};
//        process(integers, x-> x);
//        process(integers, x-> x*x);
//
    }
//
//    public static void process(Integer [] integers, MyFunction<Integer, Integer> f){
//        for (Integer i : integers){
//            System.out.println(f.apply(i));
//        }
//    }
}