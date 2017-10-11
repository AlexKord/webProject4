package ua.kpi.payments.model.dao;

import ua.kpi.payments.util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    private static boolean status;
    public static boolean validate(String login, String password) {
        try (Connection connection = ConnectionManager.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM payment_system.clients " +
                    "WHERE login=? AND password=?");
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            status = resultSet.next();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return status;
    }
}
