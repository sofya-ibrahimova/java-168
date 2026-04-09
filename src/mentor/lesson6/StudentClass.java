package mentor.lesson6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentClass {

    private long id;
    private String name;
    private double gpa;

    private static List<StudentClass> list;


    public StudentClass(long id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public static void addStudent(long id, String name, double gpa) {
        StudentClass student = new StudentClass(id, name, gpa);
        if (list != null) {
            list.add(student);
        } else {
            list = new ArrayList<>();
            list.add(student);
        }
    }

    public static List<String> filterByGpa(double gpa) {
        List<String> linkedList =
                list.stream()
                        .filter(student -> student.gpa > gpa)
                        .map(StudentClass::toString)
                        .collect(Collectors.toCollection(LinkedList::new));
        return linkedList;
    }

    public static List<String> top3Student(){
        List<String> top3 =
                list.stream()
                        .sorted(Comparator.comparing(StudentClass::getGpa).reversed())
                        .limit(3)
                        .map(StudentClass::toString)
                        .toList();
        return top3;
}
}
