package ua.kpi.payments.testDB;

import java.sql.*;

public class CreateTable {
    private static String url = "jdbc:mysql://localhost:3306/mydbtest";
    private static String name = "root";
    private static String password = "root";

    public static void createTable() {
        try(Connection connection = DriverManager.getConnection(url, name, password);
            Statement statement = connection.createStatement()) {
            Class.forName("com.mysql.jdbc.Driver");
            statement.execute("DROP TABLE IF EXISTS test_table");
            statement.executeUpdate("CREATE TABLE test_table (id INT NOT NULL AUTO_INCREMENT, name CHAR(20), dt DATE , PRIMARY KEY (id))");
            statement.executeUpdate("INSERT INTO test_table (name, dt) VALUES ('Alex','1983-05-08')");
            statement.executeUpdate("INSERT INTO test_table (name, dt) VALUES ('Leschik','1983-10-28')");
            statement.executeUpdate("INSERT INTO test_table (name, dt) VALUES ('Arishka','2016-10-27')");

            CallableStatement callableStatement = connection.prepareCall("{CALL FamilyCount(?)}");
            callableStatement.registerOutParameter(1, Types.INTEGER);
            callableStatement.execute();
            System.out.println(callableStatement.getInt(1));
            System.out.println("+++++++++++++++");

            callableStatement = connection.prepareCall("{CALL GetNames(?)}");
            callableStatement.setInt(1, 2);
            if (callableStatement.execute()) {
                ResultSet resultSet = callableStatement.getResultSet();
                while (resultSet.next()) {
                    System.out.print(resultSet.getString("id") + ": ");
                    System.out.println(resultSet.getString("name"));
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
