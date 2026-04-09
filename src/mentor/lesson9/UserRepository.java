package mentor.lesson9;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepository {

    //add getAllStudents()  getStudentByID deleteStudent updateStudent   addStudent


    public static PreparedStatement generatePrepareStatementForUser(User user) throws SQLException {
        PreparedStatement preparedStatement = DbConfig.connection.prepareStatement
                ("INSERT INTO user (name, surname, city) values (?, ?, ?)");
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getSurname());
        preparedStatement.setString(3, user.getCity());
        return preparedStatement;
    }




}
