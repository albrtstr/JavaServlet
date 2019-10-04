<%-- 
    Document   : inputData
    Created on : Oct 3, 2019, 11:22:00 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="/.inputDataServlet">
        <h1>Masukkan Data</h1>
        <tr>
            <td>Nama</td>
            <td>:</td>
            <td><input type="text" size="20" name="userName" value=""/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td>:</td>
            <td><input type="text" size="20" name="password" value=""/></td>
        </tr>
        <tr>
            <td>Email Address</td>
            <td>:</td>
            <td><input type="text" size="20" name="emailAddress"
    </body>
</html>
