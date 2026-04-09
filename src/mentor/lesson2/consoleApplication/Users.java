package mentor.lesson2.consoleApplication;

import java.util.InputMismatchException;

public class Users {
    private  int ID;
    private String name;
    private String surname;
    private int age;
    private String phone;

    Users() {
    }

    Users(String name, String surname, int age, String phone) throws InvalidInputException {
        if (name == null || name.isBlank() || surname.isBlank()) {
            throw new InvalidInputException("Wrong name or surname input!");
        }
        this.name = name;
        this.surname = surname;
        if (age < 1 || age > 120) {
            throw new InvalidInputException("Age value out of range 1-120");
        }
        this.age = age;
        if (phone.length() != 10 || phone.isBlank()) {
            throw new InvalidInputException("Wrong phone number!");
        }
        this.phone = phone;
    }

    public void setName(String name) throws InvalidInputException {
        if (name == null || name.isBlank() || name.matches(".*\\d.*")) {
            throw new InvalidInputException("Wrong name input!");
        }
        this.name = name;
    }

    public void setSurname(String surname) throws InvalidInputException {
        if (surname == null || surname.isBlank() || name.matches(".*\\d.*")) {
            throw new InvalidInputException("Wrong surname input!");
        }
        this.surname = surname;
    }


    public void setAge(int age) throws InvalidInputException {
        if (age < 1 || age > 120) {
            throw new InvalidInputException("Age value out of range 1 - 120");
        }
        this.age = age;
    }

    public void setPhone(String phone) throws InvalidInputException {
        if (phone.length() != 10 || phone.isBlank()) {
            throw new InvalidInputException("Wrong phone number!");
        }
        try {
            this.phone = phone;
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String toString() {
        return ID + "," + name + "," + surname + "," + age + "," + phone;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public String getPhone() {
        return phone;

    }
}
