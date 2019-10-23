<%-- 
    Document   : formUpdateStok
    Created on : Oct 21, 2019, 3:59:01 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <% String idProduk = request.getParameter("idProduk");%>
        <% String merkProduk = request.getParameter("merkProduk");%>
        <% String tipeProduk = request.getParameter("tipeProduk");%>
        <% String radioJenis = request.getParameter("radioJenis");%>
        <% String jenisPlatform = request.getParameter("jenisPlatform");%>
        <% String hargaProduk = request.getParameter("hargaProduk");%>
        <% String jumlahProduk = request.getParameter("jumlahProduk");%>
        <form method="GET" action="./updateStock">
            <h2>Update Data Produk</h2>
            <table>
                <tr>
                    <td>Produk ID</td>
                    <td>:</td>
                    <td><input class='isiForm' type=text name='idProduk' size="25" value=<%=idProduk%> readonly></td>
                </tr>
                <tr>
                    <td>Merk</td>
                    <td>:</td>
                    <td><input class='isiForm' type=text name=merkProduk size=25 value=<%=merkProduk%>></td>
                </tr>
                <tr>
                    <td>Tipe</td>
                    <td>:</td>
                    <td><input class='isiForm' type=text name=tipeProduk size=25 value=<%=tipeProduk%>></td>
                </tr>
                <tr>
                    <td>Jenis</td>
                    <td></td>
                    <td><input type=radio name=radioJenis value='Smartphone'> Smartphone </td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type=radio name=radioJenis value='Tablet'> Tablet</td>
                </tr>
                <tr>
                    <td>Platform</td>
                    <td>:</td>
                    <td><select class='isiForm' name='jenisPlatform'>
                            <option value='Android'>Android</option>
                            <option value='iOS'>iOS</option>
                            <option value='Windows'>Windows</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Harga</td>
                    <td>:</td>
                    <td><input class='isiForm' type=text name=hargaProduk value=<%=hargaProduk%>></td>
                </tr>
                <tr>
                    <td>Jumlah</td>
                    <td>:</td>
                    <td><input class='isiForm' type=text name=jumlahProduk value=<%=jumlahProduk%>></td>
                </tr>
            </table>
            <table>
                <tr>
                    <td></td>
                    <td><button class='Button' type='submit' name='button' value="updateButton">Update Item</td>
                </tr>
            </table>
        </form>
    </body>
</html>
