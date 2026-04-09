package mentor.lesson7.task17;

import javax.swing.plaf.synth.SynthToolTipUI;
import java.util.*;

public class Task17 {
    public static void main(String[] args) {
        List<Student17> list = new ArrayList<>();
        list.add(new Student17("Narmin", 3.4));
        list.add(new Student17("Sevda", 3.9));
        list.add(new Student17("Aynur", 4.0));
        list.add(new Student17("Samira", 2.4));

        Map<String, Student17> map = new HashMap<>();
        for (Student17 student : list){
            map.put(student.getName(), student);
        }
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(map.get(name));


    }
}
