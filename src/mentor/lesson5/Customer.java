package mentor.lesson5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    @CustomAnno
    private String name;

    @CustomAnno
    private int age;

    @CustomAnno
    private int id;

    private String bio;

    public Customer(String name, int age, int id, String bio) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.bio = bio;

    }


    public static void main(String[] args) {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("Sevda", 25, 1, "good girl"));
        list.add(new Customer("Ilaha", 26, 2, "teacher"));
        list.add(new Customer("Aynur", 33, 3, "doctor"));
        list.add(new Customer("Mehrana", 30, 4, "math teacher"));

        try {
            WriteToExcel.writeCustomerToExcel(list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
