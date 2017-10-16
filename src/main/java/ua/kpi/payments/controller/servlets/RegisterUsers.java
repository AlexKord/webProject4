package ua.kpi.payments.controller.servlets;

import ua.kpi.payments.util.ConnectionManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "RegisterUsers", urlPatterns = "/register")
public class RegisterUsers extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id;
        String firstName, lastName, email, login, password;
        id = Integer.parseInt(request.getParameter("id"));
        firstName = request.getParameter("first_name");
        lastName = request.getParameter("last_name");
        email = request.getParameter("email");
        login = request.getParameter("login");
        password = request.getParameter("password");
        try (Connection connection = ConnectionManager.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO payment_system.clients (id, first_name, last_name, email, login, password)" +
                    " VALUES (?,?,?,?,?,?)");
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, login);
            preparedStatement.setString(6, password);
            preparedStatement.executeUpdate();
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("register.jsp").forward(request, response);
    }
}
