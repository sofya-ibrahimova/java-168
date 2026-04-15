package mentor.lesson9;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// getAllStudents()  getStudentByID deleteStudent updateStudent  addStudent
public class UserRepo {

    public static List<User> selectAllUsers() throws SQLException {
        List<User> list = new ArrayList<>();
        try (Statement statement = DbConfig.connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM users")) {

            while (resultSet.next()) {
                list.add(mapUser(resultSet));
            }
            return list;
        }
    }

    public static User mapUser(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt(1);
        String name = resultSet.getString(2);
        String surname = resultSet.getString(3);
        String city = resultSet.getString(4);
        Integer age = resultSet.getInt(5);
        User user = new User(id, name, surname, city, age);

        return user;
    }

    public static boolean addUser(User user) throws SQLException {
        try (PreparedStatement ps = DbConfig.connection.prepareStatement
                ("INSERT INTO users (name, surname, city, age) values (?, ?, ?,?)")) {

            ps.setString(1, user.getName());
            ps.setString(2, user.getSurname());
            ps.setString(3, user.getCity());
            ps.setInt(4, user.getAge());
            int count = ps.executeUpdate();
            return count == 1;
        }
    }

    public static boolean deleteUser(int id) throws SQLException {
        try (PreparedStatement ps = DbConfig.connection.prepareStatement("DELETE FROM users where id = ?")) {

            ps.setInt(1, id);
            int count = ps.executeUpdate();
            return count == 1;
        }
    }

    public static User showUserByID(int id) throws SQLException {
        try (PreparedStatement ps = DbConfig.connection.prepareStatement("SELECT * FROM users where id = ?")) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return mapUser(rs);
            } else return null;
        }
    }

    public static boolean updateUser(int id, String newName, String newSurname, String newCity, int newAge) throws SQLException {
        try (PreparedStatement ps = DbConfig.connection.prepareStatement(
                "UPDATE users SET name = ?, surname = ?, city = ?, age =? WHERE id = ?")) {
            ps.setString(1, newName);
            ps.setString(2, newSurname);
            ps.setString(3, newCity);
            ps.setInt(4, newAge);
            ps.setInt(5, id);

            int count = ps.executeUpdate();
            return count == 1;
        }
    }
}

