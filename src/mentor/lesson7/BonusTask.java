package mentor.lesson7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BonusTask {
    public static void main(String[] args) {

        int[] array = {1, 12, 3, 4, 5, 16, 7, 11, 9, 20, 17, 12, 13, 14, 15};
        int target = 13;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int number = target - array[i];

            if (map.containsKey(number)){
                System.out.println("Indexler: " + map.get(number) +  " ve " + i);
        }
            map.put(array[i], i); // key - deyer, value - index

    }
}
}

