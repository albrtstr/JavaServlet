<%-- 
    Document   : formSearchUser
    Created on : Oct 11, 2019, 3:29:27 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <body>
    <form method=GET action="./searchUser">
        <center>
    <h2>Cari Data</h2>
      <table>
        <tr>
          <td>Username</td>
          <td>:</td>
          <td><input type="text" size="20" name="userName" value=""</td>
        </tr>
        <tr>
          <td></td>
          <td></td>
          <td><input type="submit" name="searchUser" value="Search"</td>
        </tr>
      </table>
        </center>
    </form>
  </body>
</html>
