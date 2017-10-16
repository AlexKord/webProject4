package ua.kpi.payments.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDAOFactory implements DAOFactory {
    private String url = "jdbc:mysql://localhost:3306/payment_system?useSSL=false";
    private String userName = "root";
    private String password = "root";

    public MySQLDAOFactory() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, userName, password);
    }

    @Override
    public AccountDAO getAccountDAO(Connection connetion) {
        return new MySQLAccountDAO();
    }

    @Override
    public AdminDAO getAdminDAO(Connection connection) {
        return new MySQLAdminDAO();
    }

    @Override
    public ClientDAO getClientDAO(Connection connection) {
        return new MySQLClientDAO();
    }

    @Override
    public CreditCardDAO getCreditCardDAO(Connection connection) {
        return new MySQLCreditCardDAO();
    }

    @Override
    public PaymentDAO getPaymentDAO(Connection connection) {
        return new MySQLPaymentDAO();
    }
}
