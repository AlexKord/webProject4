package ua.kpi.payments.model.dao;

import org.junit.Assert;
import org.junit.Test;
import ua.kpi.payments.model.entity.Client;

import java.sql.Connection;
import java.util.List;

import static org.junit.Assert.*;

public class MySQLClientDAOTest {
    @Test
    public void getAll() throws Exception {
        DAOFactory daoFactory = new MySQLDAOFactory();
        List<Client> list;
        try (Connection connection = daoFactory.getConnection()) {
            ClientDAO clientDAO = daoFactory.getClientDAO(connection);
            list = clientDAO.getAll();
        }
        assertNotNull(list);
        assertTrue(list.size() > 0);
    }

}