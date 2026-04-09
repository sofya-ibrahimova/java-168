package lesson24;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Month;

public class Lesson24 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2020, Month.APRIL, 1);
        Customer customer1 = new Customer(date, "2a78dr8", "Sevda");

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println(cores);


    }
//
//    public static void validateCustomer (Customer customer) throws NoSuchFieldException, IllegalAccessException {
//        Field field = customer.getClass().getDeclaredField("finCode");
//        field.setAccessible(true);
//        String finCode = (String) field.get(customer);
//Range range =  if (finCode.length() > 7 && finCode.length() < 7)
}


