package ua.kpi.payments.testDB;


import ua.kpi.payments.model.dao.MySQLDAOFactory;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new MySQLDAOFactory().getConnection();
    }
}
