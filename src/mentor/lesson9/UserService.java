package mentor.lesson9;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private static List<User> list = null;

    public static String normalizeString(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static boolean addUser(User user) throws SQLException {
        user.setName(normalizeString(user.getName()));
        user.setSurname(normalizeString(user.getSurname()));
        user.setCity(normalizeString(user.getCity()));
        return UserRepo.addUser(user);
    }

    public static User showUserByID(int id) throws SQLException {
        return UserRepo.showUserByID(id);

    }

    public static boolean deleteUser(int id) throws SQLException {
        return UserRepo.deleteUser(id);
    }

    public static boolean updateUser(int id, User user) throws SQLException {
        user.setName(normalizeString(user.getName()));
        user.setSurname(normalizeString(user.getSurname()));
        user.setCity(normalizeString(user.getCity()));
        return UserRepo.updateUser(id, user.getName(), user.getSurname(), user.getCity(), user.getAge());
    }

    public static List<User> showAllUsers() throws SQLException {
        return list = UserRepo.selectAllUsers();

    }

    public static boolean validateAge(Integer age) {
        if (age > 120 || age < 0) {
            return false;
        }
        return true;
    }
}

