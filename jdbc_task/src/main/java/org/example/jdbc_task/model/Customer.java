package org.example.jdbc_task.model;

public class Customer {
    private Integer customerID;
    private String name;
    private String surname;
    private Integer age;

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
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

    public Customer(Integer customerID, String name, String surname, Integer age) {
        this.customerID = customerID;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
