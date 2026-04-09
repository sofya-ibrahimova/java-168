package mentor.lesson7.task12;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Task12 {
    public static void main(String[] args) {

        Map<String, List<Integer>> map = new HashMap<>();
        map.put("Ali", List.of());
        map.put("Zeynab", List.of(95, 80, 71));
        map.put("Aisha", List.of(58, 95, 76));

        System.out.println(map.entrySet());

        Function<List<Integer>, Double> function = (list) -> {

            double sum = 0;
            for (Integer a : list) {
                sum += a;
            }
            return sum / list.size();
        };

        for (Map.Entry<String,List<Integer>> entry : map.entrySet()){ //Entry!!!
        Double d = function.apply(entry.getValue());
            System.out.println(entry.getKey() + " " + d);
        }

    }


}
