<%-- 
    Document   : kalkulator
    Created on : Sep 14, 2019, 8:38:06 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <title>Kalkulator Sederhana</title>
    </head>

    <h1>Kalkulator Sederhana</h1>

    <body>
        <form action='kalkulator' method='GET'>
            <table>
                <tr>
                    <td>Bilangan 1</td>
                    <td>:</td>
                    <td><input type="text" name="Bil1"></td>
                </tr>
                <tr>
                    <td>Bilangan 2</td>
                    <td>:</td>
                    <td><input type="text" name="Bil2"></td>
                </tr>
                <tr>
                    <td>Hasil</td>
                    <td>:</td>
                    <td><input type="text" name="Hasil"></td>
                </tr>
                <tr>
                    <td colspan="3">
                        <input type='submit' name='Operasi' value='+'>
                        <input type="submit" name='Operasi' value="-">
                        <input type="submit" name='Operasi' value="*">
                        <input type="submit" name='Operasi' value="/">
                    </td>
                </tr>

            </table>
    </body>

</html>
