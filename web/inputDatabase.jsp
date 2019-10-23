<%-- 
    Document   : inputDatabase
    Created on : Oct 10, 2019, 4:01:43 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <body>
    <form method=GET action="./addUser">
    <h2>Masukin Data</h2>
      <table>
        <tr>
          <td>Username</td>
          <td>:</td>
          <td><input type="text" size="20" name="userName" value=""</td>
        </tr>
        <tr>
          <td>Password</td>
          <td>:</td>
          <td><input type="password" size="20" name="password" value=""></td>
        </tr>
        <tr>
          <td>Email Address</td>
          <td>:</td>
          <td><input type="text" size="20" name="emailAddress" value=""></td>
        </tr>
        <tr>
          <td>Birthdate</td>
          <td>:</td>
          <td><input type="text" size="20" name="birthDate" value=""></td>
        </tr>
        <tr>
          <td></td>
        </tr>
        <tr>
          <td></td>
          <td></td>
          <td><input type="submit" name="submitData" value="OK"</td>
        </tr>
      </table>
    </form>
  </body>
</html>
