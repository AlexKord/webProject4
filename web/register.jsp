<%--
  Created by IntelliJ IDEA.
  User: Lesya
  Date: 05.10.2017
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body {
        background-image: url(/images/1908_Portland,_Oregon_voter_registration.jpeg);
        background-size: cover;
    }
    th {
        color: lightcyan;
    }
</style>
<head>
    <title>Register</title>
</head>
<body>
<div align="center">
    <h1 style="color: brown">Registration form</h1>
    <form action="/register" method="post">
        <table>
            <tr>
                <th>Client ID</th>
                <td><input type="text" name="id"/></td>
            </tr>
            <tr>
                <th>First Name</th>
                <td><input type="text" name="first_name"/></td>
            </tr>
            <tr>
                <th>Last Name</th>
                <td><input type="text" name="last_name"/></td>
            </tr>
            <tr>
                <th>Email</th>
                <td><input type="email" name="email"></td>
            </tr>
            <tr>
                <th>Login</th>
                <td><input type="text" name="login"></td>
            </tr>
            <tr>
                <th>Password</th>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td align="right"><a href="/welcome"><input type="submit" value="Register"></a></td>
            </tr>
        </table>
    </form>
    <a href="/start"><input type="submit" value="Back"></a>
    <%--<a href="/welcome"><input type="submit" value="Register"></a>--%>
</div>

</body>
</html>
