package mentor.lesson7.task19;

import org.postgresql.jdbc.SslMode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Azerbaijan", "Baku");
        map.put("Turkey", "Ankara");
        map.put("Russia", "Moskow");
        map.put("Germany", "Berlin");
        map.put("Japan", "Tokyo");

        for (Map.Entry<String, String> entry : map.entrySet()) { //способ 1
            System.out.print(entry.getKey() + " ");
        }
        System.out.println();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
        System.out.println();
        System.out.println(map.values()); //способ 2
        System.out.println(map.keySet());

        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println( map.get(name));

    }
}
