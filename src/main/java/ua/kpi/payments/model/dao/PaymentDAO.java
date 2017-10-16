package ua.kpi.payments.model.dao;

import ua.kpi.payments.model.entity.Payment;

import java.sql.SQLException;
import java.util.List;

public interface PaymentDAO {
    Payment create();
    Payment read(int key);
    void update(Payment payment);
    void delete(Payment payment);
    List<Payment> getAll()throws SQLException;
}
