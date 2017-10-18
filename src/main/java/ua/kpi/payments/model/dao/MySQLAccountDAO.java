package ua.kpi.payments.model.dao;

import ua.kpi.payments.model.entity.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MySQLAccountDAO implements AccountDAO {
    private Connection connection;

    public MySQLAccountDAO() {
    }

    public MySQLAccountDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Account create() {
        return null;
    }

    @Override
    public Account read(int key) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM payment_system.accounts WHERE id=?");
        preparedStatement.setInt(1, key);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        Account account = new Account();
        account.setAccount_id(resultSet.getInt("account_id"));
        account.setBalance(resultSet.getDouble("balance"));
        account.setBlocked(resultSet.getBoolean("status"));
        account.setCardNumber(resultSet.getInt("card_number"));
        return account;
    }

    @Override
    public void update(Account account) {

    }

    @Override
    public void delete(Account account) {

    }

    @Override
    public List<Account> getAll() throws SQLException {
        return null;
    }
}
