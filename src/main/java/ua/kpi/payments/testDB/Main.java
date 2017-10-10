package ua.kpi.payments.testDB;

import ua.kpi.payments.util.ConnectionManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        int id;
        String firstName, lastName, email, login, password;
        id = 6;
        firstName = "Misha";
        lastName = "Panov";
        email = "email";
        login = "login";
        password = "qazxswedc";
        try (Connection connection = ConnectionManager.getConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate("INSERT INTO payment_system.clients (id, first_name, last_name, login, password) VALUES " +
                    "(5, 'Miha', 'Panov', 'miha', 'pass')");
//            request.getRequestDispatcher("error.jsp").forward(request, response);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
