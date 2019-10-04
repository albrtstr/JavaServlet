<%-- 
    Document   : inputform
    Created on : Sep 20, 2019, 12:15:46 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<body>
  <form method="POST" action="./SubmitDataServlet">
    <table>
      <tr>
        <td>NIM</td>
        <td>:</td>
        <td><input type="text" size="20" name="nim" value=""/></td>
      </tr>
      <tr>
        <td>Nama</td>
        <td>:</td>
        <td><input type="text" size="20" name="nama" value=""/></td>
      </tr>
      <tr>
        <td>Status Kelulusan</td>
        <td>:</td>
        <td><select name="statuslulus">
          <option value="MEMUASKAN">Memuaskan</option>
          <option value="SANGAT MEMUASKAN">Sangat Memuaskan</option>
          <option value="CUMLAUDE">Cumlaude</option>
        </select>
        </td>
      </tr>
      <tr>
          <td>Keterangan</td>
          <td>:</td>
          <td><textarea name="keterangan"></textarea></td>
      </tr>
      <tr>
        <td></td>
        <td></td>
        <td><input type="submit" name="submit" value="Submit Data"></td>
      </tr>
    </table>
  </form>
</body>