package mentor.lesson7.task2;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable {

    private long id;
    private String name;
    private int age;
    private double gpa;

    public Student(long id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((Student) o).name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(34721, "Lale", 12, 3.4));
        list.add(new Student(34521, "Ayla", 18, 3.0));
        list.add(new Student(34771, "Aynur", 20, 4.9));
        list.sort(null);
        System.out.println(list);
    }
}

