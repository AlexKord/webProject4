package ua.kpi.payments.model.dao;

import ua.kpi.payments.model.entity.Client;

import java.sql.SQLException;
import java.util.List;

public interface ClientDAO {
    Client create();
    Client read(int key) throws SQLException;
    void update(Client client);
    void delete(Client client);
    List<Client> getAll()throws SQLException;
}
