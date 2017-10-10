<%--
  Created by IntelliJ IDEA.
  User: Lesya
  Date: 27.09.2017
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
 body {
     background-image: url("/images/atlantis_nebula_7-wallpaper-2560x1440.jpg");
 }
    td {
        color: lawngreen;
    }
</style>
<head>
    <title>Login Page</title>
</head>
<body style="background-color: lightseagreen">
    <form action="/login" method="post">
        <div align="center">
            <fieldset style="width: 300px">
                <legend style="color: lawngreen"> Login to App </legend>
                <table>
                    <tr>
                        <td>User login</td>
                        <td><input type="text" name="username" required="required" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" required="required" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login"/></td>
                    </tr>
                </table>
            </fieldset>
        </div>
    </form>
</body>
</html>
