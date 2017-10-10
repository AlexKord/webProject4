package ua.kpi.payments.util;

import java.sql.*;

public class ConnectionManager {
    private static Connection connection;
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/payment_system?useSSL=false";
        String userName = "root";
        String password = "root";
        Class.forName("com.mysql.jdbc.Driver");
        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
