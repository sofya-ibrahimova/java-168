package mentor.lesson7.task8;

public class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private int salary;
    private String department;

    Employee(int id, String name, int salary, String department){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if (this.salary > o.salary){
            return 1;
        }
        if (this.salary < o.salary){
            return -1;
        }
        return 0;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
