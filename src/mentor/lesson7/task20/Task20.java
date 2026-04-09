package mentor.lesson7.task20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Task20 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Narmin", 30));
        list.add(new Person("Nargiz", 26));
        list.add(new Person("Sevinc", 12));
        list.add(new Person("Aayla", 17));

        Function<List<Person>, List<Person>> f = people -> people.stream()
                .filter(person -> person.getAge() > 18)
                .toList();
        System.out.println(f.apply(list));

        Function<List<Person>, List<Person>> f1 = people -> people.stream()
                //может упасть с charAt(0)
                .filter(person -> person.getName().startsWith("a") && person.getName().startsWith("A"))
                .toList();
        System.out.println(f1.apply(list));

        Function<List<Person>, Person> f2 = people -> people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .findFirst() //new method
                .orElse(null);
        System.out.println(f2.apply(list));

    }

}
