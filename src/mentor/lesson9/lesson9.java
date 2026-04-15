package mentor.lesson9;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class lesson9 {
    public static void main(String[] args) throws SQLException {

        MenuController menuController = new MenuController();
        DbConfig.loadDriver();
        DbConfig.connect();
        a:
        while (true) {
            menuController.showMenu();
            switch (menuController.getUserChoice()) {
                case 1 -> menuController.showAllUsers();
                case 2 -> menuController.showUserByID();
                case 3 -> menuController.addUser();
                case 4 -> menuController.deleteUser();
                case 5 -> menuController.updateUser();
                default -> {
                    break a;
                }
            }
        }
        DbConfig.close();

    }
}
