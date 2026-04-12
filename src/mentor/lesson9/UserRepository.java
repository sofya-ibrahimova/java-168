package mentor.lesson9;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepository {
    private final String selectQuery = "SELECT * FROM user";
    private final String InsertQuery = "INSERT INTO user (name, surname, city) values (?, ?, ?)";
    private final String DeleteQuery = "DELETE FROM user where id = ?";


    // getAllStudents()  getStudentByID deleteStudent updateStudent  addStudent


    public static PreparedStatement generatePrepareStatement(User user) throws SQLException {
        PreparedStatement preparedStatement = DbConfig.connection.prepareStatement
                ("INSERT INTO user (name, surname, city) values (?, ?, ?)");
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getSurname());
        preparedStatement.setString(3, user.getCity());
        return preparedStatement;
    }

public static PreparedStatement generatePrepareStatementForUser1(User user) throws SQLException {
    PreparedStatement preparedStatement = DbConfig.connection.prepareStatement("SELECT * FROM user");
    return preparedStatement;

}




}
