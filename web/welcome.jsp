<%@ page import="ua.kpi.payments.model.entity.Client" %>
<%--
  Created by IntelliJ IDEA.
  User: Lesya
  Date: 02.10.2017
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    body {
        background-image: url("/images/sub-page-banner-payment.jpg");
        background-size: cover;
    }

    p {
        padding: 10px;
        text-align: center;
        border-style: inset;
        border-width: 5px;
        border-color: blue;
    }
    div {
        width: 15%;
    }
</style>
<head>
    <title>Welcome</title>
</head>
<body>
    <div align="center">
        <h3>Welcome to system</h3>
        <h1>${login}</h1>
    </div>
</body>
</html>
