package mentor.lesson7.task21;

import mentor.lesson7.task20.Person;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;
    private int id;
    private static Map<Integer, Student> map = new HashMap<>();

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static Map<Integer, Student> getMap() {
        return map;
    }

    public static void setMap(Student student) {
        map.put(student.getId(), student);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {

     Student student1 = new Student("Lale", 21220);
     Student student2 = new Student("Sevda", 11339);
        Student.setMap(student1);
        Student.setMap(student2);
        System.out.println(Student.getMap().get(21220));
    }

}
