package mentor.lesson2.consoleApplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class testConsoleApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileService fileService = new FileService();
        UserService userService = new UserService(fileService);
        userService.init();
        a:
        while (true) {
            System.out.println("1. Register new user\n2. List users (from memory)\n3. Save users to file\n" +
                    "4. Load users from file\n5. Delete user\n6. Search user\n7. Exit");
            int number;
            try {
                number = sc.nextInt();;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!");
                sc.nextLine();
                continue;
            }
            switch (number) {
                case 1:
                    userService.userRegister();
                    break;
                case 2:
                    userService.listUsers();
                    break;
                case 3:
                    userService.saveUsers();
                    break;
                case 4:
                    userService.loadUsers();
                    break;
                case 5:
                    userService.deleteUser();
                    break ;
                case 6:
                    userService.searchUser();
                    break ;
                default:
                    break a;
            }

        }
    }
}
