package ua.kpi.payments.model.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface DAOFactory {
    Connection getConnection() throws SQLException;

    AccountDAO getAccountDAO(Connection connetion);

    AdminDAO getAdminDAO(Connection connection);

    ClientDAO getClientDAO(Connection connection);

    CreditCardDAO getCreditCardDAO(Connection connection);

    PaymentDAO getPaymentDAO(Connection connection);
}
