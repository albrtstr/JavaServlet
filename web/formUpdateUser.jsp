<%-- 
    Document   : formUpdateUser
    Created on : Oct 12, 2019, 12:03:00 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <% String username = request.getParameter("userName");%>
        <form method=GET action="./updateUser">
            <center>
                <h2>Update Username</h2>
                <table>
                    <tr>
                        <td>Username lama</td>
                        <td>:</td>
                        <td><input type="text" name="userLama" value=<%=username%> readonly> </td>
                    </tr>
                    <tr>
                        <td>Username baru</td>
                        <td>:</td>
                        <td><input type="text" size="20" name="userBaru" value=""></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td><input type="submit" name="updateUser" value="Update"</td>
                    </tr>
                </table>
        </form>
    </center>
</body>
</html>
