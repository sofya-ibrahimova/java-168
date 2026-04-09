package mentor.lesson7.task22;

import java.util.HashMap;
import java.util.Map;

public class Task22 {
    public static void main(String[] args) {

        Map<Character, Integer> map = wordCounter("Hello Hello world world world");
        System.out.println(map.entrySet());

    }


     public static Map<Character, Integer> wordCounter (String s){
        char [] array = s.toCharArray();
         Map<Character, Integer> map = new HashMap<>();
         for (char a : array){
             if (a == ' ') continue;
             map.put(a, map.getOrDefault(a, 0) +1);
         }
         return map;
     }
}
