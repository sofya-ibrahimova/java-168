package mentor.lesson7.task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {

        Employee employee1 = new Employee(123, "Sofya", 1500, "A");
        Employee employee2 = new Employee(123, "Sevda", 1800, "B");
        Employee employee3 = new Employee(123, "Kamila", 1300, "C");
        Employee employee4 = new Employee(123, "Nargiz", 1400, "D");
        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.sort(null);
        System.out.println(list);


        Comparator<Employee> comparator = Comparator.comparing(Employee::getDepartment);
        list.sort(comparator);
        System.out.println(list);
    }
}