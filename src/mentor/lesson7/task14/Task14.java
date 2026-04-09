package mentor.lesson7.task14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task14 {
    public static void main(String[] args) {

        List<City> list = new ArrayList<>();
        list.add(new City("Baku", 3000000));
        list.add(new City("Ankara", 9000000));
        list.add(new City("Moskva", 11000000));

        list.sort(null);
        System.out.println(list);

        Comparator<City> comparator = Comparator.comparing(City::getName);
        list.sort(comparator);
        System.out.println(list);

    }
}
