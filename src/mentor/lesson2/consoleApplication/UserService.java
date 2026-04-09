package mentor.lesson2.consoleApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserService {


    private Users[] users = new Users[10];
    private Users[] newUsers = new Users[10];
    FileService fileService;
    private int nextId;

    Scanner sc = new Scanner(System.in);


    public UserService(FileService fileService) {
        this.fileService = fileService;
    }


    public void init() {
        int count = 0;
        loadUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) break;
            else count++;
        }
        nextId = count;
        clear(users);
    }

    public void userRegister() {
        clear(newUsers);
        loadUsers();
        Users newUser;
        int count = 0;
        while (true) {
            try {
                System.out.println("NAME AND SURNAME");
                String name = sc.next();
                String surname = sc.next();
                System.out.println("AGE: ");
                int age = sc.nextInt();
                System.out.println("PHONE NUMBER:");
                String phoneNumber = sc.next();
                newUser = new Users(name, surname, age, phoneNumber);
            } catch (InputMismatchException | InvalidInputException e) {
                System.out.println(e.getMessage());
                continue;
            }
            boolean isExist = true;
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null && users[i].getPhone().equals(newUser.getPhone())) {
                    System.out.println("User with this phone is exist❌");
                    isExist = false;
                    break;
                }
            }
            if (isExist) {
                newUsers[count++] = newUser;  //array index out of bound
                nextId++;
                newUser.setID(nextId);
            }

            System.out.println("Want to add new User?");
            String str = sc.next();
            if (!str.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }

    public void saveUsers() {
        String[] strUsers = new String[10];
        for (int i = 0; i < strUsers.length; i++) {
            if (newUsers[i] == null) {
                break;
            } else {
                strUsers[i] = newUsers[i].toString();
            }
        }
        fileService.saveUsersToFile(strUsers);  // !!
        System.out.println("Users saved✅");
        clear(newUsers);
    }

    public void saveUsersRe() {
        String[] strUsers = new String[10];
        for (int i = 0; i < strUsers.length; i++) {
            if (newUsers[i] == null) {
                fileService.saveUsersToFileRe(strUsers);  //??
                break;
            } else {
                strUsers[i] = newUsers[i].toString();
            }
            fileService.saveUsersToFileRe(strUsers);//!!
        }
        System.out.println("Users saved✅");
        clear(newUsers);
    }


    public void loadUsers() {
        String[] strUsers = fileService.loadUsersFromFile();
        for (int i = 0; i < strUsers.length; i++) {
            if (strUsers[i] != null && !strUsers[i].isBlank()) {
                String[] parts = strUsers[i].split(",");
                users[i] = new Users();
                try {
                    users[i].setID(Integer.parseInt(parts[0]));
                    users[i].setName(parts[1]);
                    users[i].setSurname(parts[2]);
                    users[i].setAge(Integer.parseInt(parts[3]));
                    users[i].setPhone(parts[4]);
                } catch (InvalidInputException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public void listUsers() {
        for (int i = 0; i < newUsers.length; i++) {
            if (newUsers[i] != null) {
                System.out.println(newUsers[i].toString());
            }
        }
    }

    public void deleteUser() {
        clear(users);
        loadUsers();
        System.out.println("ENTER ID FOR DELETE:\uD83D\uDDD1\uFE0F");
        int number = sc.nextInt();
        boolean isExist = true;
        for (int i = 0; i < users.length; i++) {
            newUsers[i] = users[i];
        }
        for (int i = 0; i < newUsers.length; i++) {
            if (newUsers[i] != null && newUsers[i].getID() == number) {
                isExist = false;
                if (i == newUsers.length - 1) {
                    newUsers[i] = null;
                } else {
                    for (int j = i + 1; j < newUsers.length; j++) {
                        if (newUsers[j] != null) {
                            newUsers[j - 1] = newUsers[j];
                        } else {
                            newUsers[j - 1] = null;
                            break;
                        }
                    }
                }
            }
        }
        if (isExist) {
            System.out.println("User not found!");
        } else {
            saveUsersRe();
            System.out.println("User deleted successfully✅");
        }
        clear(users);
        clear(newUsers);
    }

    public void searchUser() {
        loadUsers();
        System.out.println("Enter phone number for search:\uD83D\uDD0D");
        String phone = sc.next();
        boolean isFound = true;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getPhone().equals(phone)) {
                System.out.println("User found\uD83D\uDC64 : " + users[i].toString());
                isFound = false;
                break;

            }
        }
        if (isFound) {
            System.out.println("User not found!");
        }
        clear(users);
    }

    public void clear(Users[] user) {
        for (int i = 0; i < user.length; i++) {
            if (user[i] != null) {
                user[i] = null;
            } else {
                break;
            }
        }
    }
}
