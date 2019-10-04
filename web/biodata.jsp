<%-- 
    Document   : biodata
    Created on : Sep 20, 2019, 1:29:41 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<body>
  <form method="GET" action="./SubmitBiodata">
    <table>
      <tr>
        <td>Nama</td>
        <td>:</td>
        <td><input type="text" size="20" name="nama" value=""/></td>
      </tr>
      <tr>
        <td>Alamat</td>
        <td>:</td>
        <td><input type="text" size="20" name="alamat" value=""/></td>
      </tr>
      <tr>
        <td>Umur</td>
        <td>:</td>
        <td><input type="text" size="20" name="umur" value=""></td>
      </tr>
      <tr>
        <td>Jenis Kelamin</td>
        <td>:</td>
        <td><input type="radio" name="gender" value="Pria">Pria</td>
      </tr>
      <tr>
        <td></td>
        <td></td>
        <td><input type="radio" name="gender" value="Perempuan">Perempuan</td>
      </tr>
      <tr>
        <td>Hobby</td>
        <td>:</td>
        <td><input type="checkbox" name="hobby" value="Music">Music</td>
      </tr>
      <tr>
        <td></td>
        <td></td>
        <td><input type="checkbox" name="hobby" value="Programming">Programming</td>
      </tr>
      <tr>
        <td></td>
        <td></td>
        <td><input type="checkbox" name="hobby" value="Game">Game</td>
      </tr>
      <tr>
        <td></td>
        <td></td>
        <td><input type="checkbox" name="hobby" value="Movies">Movies</td>
      </tr>
      <tr>
        <td></td>
        <td></td>
        <td><input type="checkbox" name="hobby" value="Travelling">Travelling</td>
      </tr>
      <tr>
        <td></td>
        <td></td>
        <td><input type="checkbox" name="hobby" value="Sport">Sport</td>
      </tr>
      <tr>
        <td></td>
        <td></td>
        <td><input type="checkbox" name="hobby" value="Organization">Organization</td>
      </tr>
      <tr>
        <td></td>
        <td></td>
        <td><input type="checkbox" name="hobby" value="Automotive">Automotive</td>
      </tr>
      <tr>
        <td><input type="submit" name="submit" value="Submit Data"></td>
      </tr>
    </table>
  </form>
</body>
