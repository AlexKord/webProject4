package ua.kpi.payments.model.dao;

import ua.kpi.payments.model.entity.Payment;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MySQLPaymentDAO implements PaymentDAO {
    private final Connection connection = null;

    public MySQLPaymentDAO() {
    }

    @Override
    public Payment create() {
        return null;
    }

    @Override
    public Payment read(int key) {
        return null;
    }

    @Override
    public void update(Payment payment) {

    }

    @Override
    public void delete(Payment payment) {

    }

    @Override
    public List<Payment> getAll() throws SQLException {
        return null;
    }
}
