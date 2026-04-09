package mentor.lesson7.task15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Book", 15);
        map.put("Notebook", 27);
        map.put("Phone", 13);

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if (map.get(name) == null){
            System.out.println("Not found!");
        }else {
            System.out.println(map.get(name));
        }
        }
    }

