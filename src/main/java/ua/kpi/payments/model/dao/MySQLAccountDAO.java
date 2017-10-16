package ua.kpi.payments.model.dao;

import ua.kpi.payments.model.entity.Account;

import java.sql.SQLException;
import java.util.List;

public class MySQLAccountDAO implements AccountDAO {
    @Override
    public Account create() {
        return null;
    }

    @Override
    public Account read(int key) {
        return null;
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
