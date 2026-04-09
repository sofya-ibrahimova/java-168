package mentor.lesson7.task6;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Task6 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Ali", 68);
        map.put("Solmaz", 81);
        map.put("Vahid", 85);
        map.put("Sevda", 75);
        map.put("Narmin", 65);

        map.forEach( (a, b) -> System.out.println(a + " " + b));
        System.out.println(map.entrySet());

        map.forEach((a,b) -> System.out.print(a + " " ));
        map.forEach((a,b) -> System.out.print(b + " "));

    }
}
