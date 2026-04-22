package org.example.jdbc_task.model;

public class Customer {

    private Integer customerID;
    private String name;
    private String surname;
    private Integer age;

    public Customer( String name, String surname, Integer age) {
        ++customerID;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Customer(Integer customerID, String name, String surname, Integer age) {
        this.customerID = customerID;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Customer() {
    }

    public Integer getId() {
        return customerID;
    }

    public void setId(Integer id) {
        this.customerID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
