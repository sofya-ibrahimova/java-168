package mentor.lesson6;

import java.lang.reflect.Array;
import java.util.*;

public class Main6 {
    public static void main(String[] args) {

//        //Student Registry (List vs Set) //Set не использовала
//        StudentClass.addStudent(23434, "Lale", 2);
//        StudentClass.addStudent(45643, "Said", 3.1);
//        StudentClass.addStudent(34687, "Ayla", 4);
//        StudentClass.addStudent(76534, "Asif", 4);
//
//
//        System.out.println(StudentClass.top3Student());
//        System.out.println("****");
//        System.out.println(StudentClass.filterByGpa(1));
//
//        // UniqueWordsAnalyzer
//        System.out.println("*****");
//        String sentence = "Hello World my name is Sofya Sofya";
//        int number = UniqueWordsAnalyzer.uniqueWordsCounter(sentence);
//        System.out.println(number);
//        System.out.println(UniqueWordsAnalyzer.largestWord(sentence));
//        Map<String, Integer> map = UniqueWordsAnalyzer.wordCounterInSentence(sentence);
//        System.out.println(map);
//
//        //Other tasks
//        //1
//        System.out.println("*****");
////        OtherTasks.addAndPrint();
//
//        //2
//        System.out.println("****");
////        OtherTasks.addAndFindMaxMin();
//
//        //3
//        System.out.println("*****");
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(5);
//        System.out.println(OtherTasks.evenNumbers(list));
//
//        //4
//        System.out.println("*****");
//        List<String> namesList = new ArrayList<>();
//        namesList.add("Sofia");
//        namesList.add("Kamila");
//        namesList.add("Sevda");
//        namesList.add("Mehrana");
//        namesList.add("Aynur");
//        OtherTasks.printFirstAndLastName(namesList);
//        System.out.println(OtherTasks.deleteName(namesList, "Sevda"));

        //5 Siyahını Tərsinə Çap Et

//        OtherTasks.printReversedNumbers(list);

        //6  Təkrarları Sil
//        OtherTasks.inputAndPrint();

        //7 Ortaq Elementləri Tap
//        Set<Integer> set1 = new HashSet<>();
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//        Set<Integer> set2 = new HashSet<>();
//        set2.add(1);
//        set2.add(4);
//        set2.add(5);
//        Set<Integer> set3 = OtherTasks.duplicateElements(set1, set2);
//        System.out.println(set3);


        // HashMap – Sadə Tasklar
        Map<String, Integer> map = new HashMap<>();
        map.put("Sevda", 25);
        map.put("Lale", 27);
        map.put("Ilaha", 24);

//        System.out.println(map);
//

        Map<String, Integer> map1 = OtherTasks.wordCounter("hello hello hello word word Sofya");
//        System.out.println(map1);

        // 10 Növbə Sistemi
//        OtherTasks.queueSystem();

        // 11 İlk Gələn İlk Çıxar
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        queue1.add(5);
        System.out.println(queue1.peek());
        System.out.println(queue1.poll());



    }
}
