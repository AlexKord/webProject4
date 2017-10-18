package ua.kpi.payments.model.dao;

import ua.kpi.payments.model.entity.Account;

import java.sql.SQLException;
import java.util.List;

public interface AccountDAO {
    Account create();
    Account read(int key) throws SQLException;
    void update(Account account);
    void delete(Account account);
    List<Account> getAll()throws SQLException;
}
