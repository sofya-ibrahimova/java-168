package mentor.lesson7.task7;

import java.util.HashMap;
import java.util.Map;

public class Task7 {
    public static void main(String[] args) {

Map<String, Integer> map = wordCounter("Hello world i am learning java Hello world");
        System.out.println(map.entrySet());
    }

    public static Map<String, Integer> wordCounter(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = sentence.split(" ");
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map;
    }

}
