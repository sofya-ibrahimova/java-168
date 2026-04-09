package mentor.lesson6;

import java.util.*;

public class OtherTasks {


    public static void addAndPrint() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("add 5 number");
        for (int i = 0; i < 5; i++) {
            int number = sc.nextInt();
            list.add(number);
        }
        System.out.println("Added number: " + list);
    }

    public static void addAndFindMaxMin() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("add 10 number");
        for (int i = 0; i < 10; i++) {
            int number = sc.nextInt();
            list.add(number);
        }
        System.out.println("max: " + Collections.max(list) + ", min: " + Collections.min(list)); //!!!
    }

    public static List<Integer> evenNumbers(List<Integer> allNumbers) {
        List<Integer> list =
                allNumbers.stream()
                        .filter(integer -> integer % 2 == 0 && integer != 0)
                        .toList();
        return list;
    }

    public static void printFirstAndLastName(List<String> names) {
        System.out.println("first: " + names.getFirst() + " last: " + names.getLast()); //!!!
    }

    public static List<String> deleteName(List<String> names, String name) {
        names.remove(name);
        return names;
    }

    public static void printReversedNumbers(List<Integer> numbers) {
        Collections.reverse(numbers);
    }

    public static void inputAndPrint() {
        Set<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " soz: ");
            String str = sc.next();
            set.add(str);
        }
        System.out.println(set);
    }

    public static Set<Integer> duplicateElements (Set<Integer> h1, Set<Integer> h2){
        h1.retainAll(h2); //!!!
        return h1;
    }

    public static Map<String,Integer> wordCounter (String sentence){
        Map<String, Integer> map = new HashMap<>();
        String [] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++){
            map.put(words[i], map.getOrDefault(words[i],0 ) +1);
        }
        return map;
     }

     public static void queueSystem (){
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        for (int i = 1; i < 6; i++ ){
            System.out.println(i + "-ci ad: ");
            String name = sc.next();
            queue.add(name);
        }
      while (!queue.isEmpty()){
          System.out.print(queue.poll() + " ");
      }

     }

}