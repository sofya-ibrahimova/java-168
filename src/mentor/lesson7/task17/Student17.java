package mentor.lesson7.task17;

import java.util.HashMap;
import java.util.Map;

public class Student17 {

    private String name;
    private double gpa;


    public Student17(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student17{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }


}
