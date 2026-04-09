package Lesson31;

import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lesson31 {
    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String name = "postgres";
            String password = "Sophie333";
            connection = DriverManager.getConnection(url, name, password);
            System.out.println("connected");

        } catch (SQLException e) {
            throw new RuntimeException(e);

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
        }
    }

    public static List<Student> getAllStudents() throws SQLException {
        List<Student> list = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
        while (resultSet.next()) {
            Integer id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            double score = resultSet.getDouble("score");
            list.add(new Student(id, name, score));
        }
        return list;
    }

    public static Student getStudentByID(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM student where id = ?");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (!resultSet.next()) {
            return null;

        }
        return new Student(
                resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getDouble("score"));
    }

    public static void deleteStudent(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM student where id = ?");
        preparedStatement.setInt(1, id);
        int count = preparedStatement.executeUpdate(); //исользуется для INSERT, UPDATE, DELETE
        if (count == 0) {
            System.out.println("Student with id = " + id + " not exist");
            throw new RuntimeException();
        }
    }

    public static void updateStudent(int id, String name, double score) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "UPDATE student SET name = ?, score = ? WHERE id = ?");
        preparedStatement.setString(1, name);
        preparedStatement.setDouble(2, score);
        preparedStatement.setInt(3, id);
        int count = preparedStatement.executeUpdate();
        if (count == 0) {
            System.out.println("Student with id = " + id + " not exist");
            throw new RuntimeException();
        }
    }

    public static void addStudent(String name, double score) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO student (name, score) values (?, ?)");
        preparedStatement.setString(1, name);
        preparedStatement.setDouble(2, score);
        preparedStatement.executeUpdate();

    }

    public static void main(String[] args) throws SQLException {
        System.out.println(getAllStudents());
        System.out.println(getStudentByID(20));
//        updateStudent(30, "Elnare", 89);
        addStudent("Serfinaz", 80);
        connection.close();
    }
}

