package mentor.lesson7.task24;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Task24 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("java", "apple", "apelsin", "avtomobil", "book", "azerbaijan"));

        Consumer<List<String>> consumer = strings -> strings.stream()
                .filter(s -> s.charAt(0) == 'a' || s.charAt(0) == 'A')
                .forEach(System.out::println);
        consumer.accept(list);

        Function<List<String>, List<String>> f = strings -> strings.stream()
                .filter(s -> s.charAt(0) == 'a' || s.charAt(0) == 'A')
                .sorted(Comparator.comparing(s -> s.length()))
                .toList();
        System.out.println(f.apply(list));
    }
}

