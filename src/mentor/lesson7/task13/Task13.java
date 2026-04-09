package mentor.lesson7.task13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Task13 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(3, 4, 12, 54, 67, 87));

        Consumer<List<Integer>> consumer1 = list1 -> System.out.println(list1.stream()
                .filter(a -> a % 2 == 0)
                .toList());
        consumer1.accept(list);

        System.out.println(list.stream().filter(a-> a%2 !=0).toList()); // другой вариант

        Consumer<List<Integer>> consumer2 = list1 -> System.out.println(list1.stream()
                .filter(a -> a % 2 != 0)
                .toList());
        consumer2.accept(list);

        Consumer<List<Integer>> consumer3 = lis1 -> System.out.println(lis1.stream()
                .filter(a -> a>10)
                .toList());
        consumer3.accept(list);

    }
}
