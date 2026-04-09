package mentor.lesson7.task10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("AAA", 2010, 7.2));
        list.add(new Movie("BBB", 2008, 6.2));
        list.add(new Movie("CCC", 2019, 6.2));
        list.add(new Movie("DDD", 2000, 6.2));
//thenComparing
        Comparator<Movie> comparator = Comparator.comparing((Movie::getRating)).reversed().thenComparing(Movie::getYear);
        list.sort(comparator);
        System.out.println(list);

    }
}
