package mentor.lesson7.task9;

import mentor.lesson7.task8.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Task9 {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product(1234, "Book", 12, 15));
        list.add(new Product(1467, "Phone", 10, 1500));
        list.add(new Product(2834, "Notebook", 9, 1800));
        list.add(new Product(1004, "Door", 50, 80));

       list.sort(Comparator.comparing(Product::getPrice));
        System.out.println(list);
       list.sort(Comparator.comparing(Product::getQuantity));
        System.out.println(list);
       list.sort(Comparator.comparing(Product::getName));
        System.out.println(list);

    }
}
