package ua.kpi.payments.model.dao;

import ua.kpi.payments.model.entity.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLClientDAO implements ClientDAO {
    private Connection connection;

    public MySQLClientDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Client create() {
        return null;
    }

    @Override
    public Client read(int key) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM payment_system.clients WHERE id=?");
        preparedStatement.setInt(1, key);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        Client client = Client.builder().
                id(resultSet.getInt("id"))
                .firstName(resultSet.getString("first_name"))
                .lastName(resultSet.getString("last_name"))
                .email(resultSet.getString("email"))
                .login(resultSet.getString("login"))
                .password(resultSet.getString("password"))
                .build();
        return client;
    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void delete(Client client) {

    }

    @Override
    public List<Client> getAll() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM payment_system.clients");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Client> clients = new ArrayList<>();
        while (resultSet.next()) {
            Client client = Client.builder().
                    id(resultSet.getInt("id"))
                    .firstName(resultSet.getString("first_name"))
                    .lastName(resultSet.getString("last_name"))
                    .email(resultSet.getString("email"))
                    .login(resultSet.getString("login"))
                    .password(resultSet.getString("password"))
                    .build();
            clients.add(client);
        }
        return clients;
    }
}
