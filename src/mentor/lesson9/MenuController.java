package mentor.lesson9;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MenuController {

    private final Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("""
                1.show all users
                2.show user by ID
                3.add user
                4.delete user
                5.update user
                6.any other number for exit;
                """);
    }

    public int getUserChoice() {
        while (true) {
            try {
                int number = scanner.nextInt();
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Try again!");
                scanner.next();
            }
        }
    }

    public void deleteUser() throws SQLException {
        int id = readValidInteger("ID");
        boolean isDeleted = UserService.deleteUser(id);
        if (isDeleted) {
            System.out.println("user deleted successfully!");
        } else {
            System.out.println("user with such id not exist!");
        }
    }

    public void updateUser() throws SQLException {
        int id = readValidInteger("ID");
        String name = readValidatedString("name");
        String surname = readValidatedString("surname");
        String city = readValidatedString("city");
        Integer age = readValidAge();
        User user = new User(name, surname, city, age);
        boolean isUpdated = UserService.updateUser(id, user);
        if (isUpdated) {
            System.out.println("user updated");
        } else System.out.println("user with this id not exist");
    }

    public void addUser() throws SQLException {
        String name = readValidatedString("name");
        String surname = readValidatedString("surname");
        String city = readValidatedString("city");
        Integer age = readValidAge();
        User user = new User(name, surname, city, age);
        boolean isAdded = UserService.addUser(user);
        if (isAdded) {
            System.out.println("user added successfully!");
        } else {
            System.out.println("user do not added!");
        }
    }

    public void showUserByID() throws SQLException {
        int id = readValidInteger("ID");
        System.out.println(UserService.showUserByID(id));
    }

    public void showAllUsers() throws SQLException {
        List<User> list = UserService.showAllUsers();
        System.out.println(list);
    }

    public String readValidatedString(String fieldname) {
        System.out.println("Enter " + fieldname);
        while (true) {
            String s = scanner.next();
            if (!s.isBlank() && s.matches("[a-zA-Z]+")) {
                return s;
            }
            System.out.println("Wrong " + fieldname + "! Try again!");
        }
    }

    public int readValidInteger(String number) {
        System.out.println("Enter " + number);
        int id;
        while (true) {
            String ID = scanner.next();
            try {
                id = Integer.parseInt(ID.trim());
                return id;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input of " + number + " !Try again");
            }
        }
    }

    public int readValidAge() {
        System.out.println("Enter age:");
        while (true) {
            int age = readValidInteger("age");
            if (UserService.validateAge(age)) {
                return age;
            }
            System.out.println("Wrong age interval! Try again!");
        }
    }
}