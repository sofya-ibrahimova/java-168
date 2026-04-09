package mentor.lesson7.task16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Task16 {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Narmin", "Math", 10);
        Teacher teacher2 = new Teacher("Sevda", "Primary", 2);
        Teacher teacher3 = new Teacher("Nargiz", "English", 4);

        List<Teacher> list = new ArrayList<>();
        list.add(teacher1);
        list.add(teacher2);
        list.add(teacher3);
        list.sort(null);
        System.out.println(list);

        Function<List<Teacher>, List<Teacher>> f = (list1) -> list1.stream()
                .filter(a -> a.getExperience() > 5)
                .toList();

        System.out.println(f.apply(list));
    }
}