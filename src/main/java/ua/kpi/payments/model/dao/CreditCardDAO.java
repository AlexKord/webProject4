package ua.kpi.payments.model.dao;

import ua.kpi.payments.model.entity.CreditCard;

import java.sql.SQLException;
import java.util.List;

public interface CreditCardDAO {
    CreditCard create();
    CreditCard read(int key);
    void update(CreditCard creditCard);
    void delete(CreditCard creditCard);
    List<CreditCard> getAll()throws SQLException;
}
