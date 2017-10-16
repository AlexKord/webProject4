package ua.kpi.payments.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDAOFactory implements DAOFactory {
    private String url = "jdbc:mysql://localhost:3306/payment_system?useSSL=false";
    private String userName = "root";
    private String password = "root";
//    Class.forName("com.mysql.jdbc.Driver");

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, userName, password);
    }

    @Override
    public AccountDAO getAccountDAO(Connection connetion) {
        return null;
    }

    @Override
    public AdminDAO getAdminDAO(Connection connection) {
        return null;
    }

    @Override
    public ClientDAO getClientDAO(Connection connection) {
        return null;
    }

    @Override
    public CreditCardDAO getCreditCardDAO(Connection connection) {
        return null;
    }

    @Override
    public PaymentDAO getPaymentDAO(Connection connection) {
        return null;
    }
}
