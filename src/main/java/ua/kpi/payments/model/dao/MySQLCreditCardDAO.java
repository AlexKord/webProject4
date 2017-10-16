package ua.kpi.payments.model.dao;

import ua.kpi.payments.model.entity.CreditCard;

import java.sql.SQLException;
import java.util.List;

public class MySQLCreditCardDAO implements CreditCardDAO {
    @Override
    public CreditCard create() {
        return null;
    }

    @Override
    public CreditCard read(int key) {
        return null;
    }

    @Override
    public void update(CreditCard creditCard) {

    }

    @Override
    public void delete(CreditCard creditCard) {

    }

    @Override
    public List<CreditCard> getAll() throws SQLException {
        return null;
    }
}
