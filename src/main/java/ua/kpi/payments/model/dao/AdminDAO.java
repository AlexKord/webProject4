package ua.kpi.payments.model.dao;

import ua.kpi.payments.model.entity.Admin;

import java.sql.SQLException;
import java.util.List;

public interface AdminDAO {
    Admin create();
    Admin read(int key);
    void update(Admin admin);
    void delete(Admin admin);
    List<Admin> getAll()throws SQLException;
}
