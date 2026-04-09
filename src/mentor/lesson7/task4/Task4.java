package mentor.lesson7.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Task4 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Sofya");
        list.add("Sevda");
        list.add("Esmiralda");
        list.add("Ilahaa");

        list.forEach(name -> System.out.println(name));// forEach
        list.forEach(name -> {
            if (name.length() > 5) {
                System.out.println(name);
            }
        });
    }


}
