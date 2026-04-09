package lesson20;

import java.io.Serializable;

public class Customer implements Serializable {
    private static final long serialVersionUID = 2L;
    private String name;
    private String surName;
    private int age;

    public Customer(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public Customer(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
