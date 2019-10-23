<%-- 
    Document   : inputStok
    Created on : Oct 21, 2019, 1:32:34 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
        .Button{
            width:70
        }
        .isiForm{
            height:25
        }
    </style>
    <script>
        function notifSimpan(){
            Alert("Data berhasil ditambahkan!");
        }
        function notifHapus(){
            Alert("Data berhasil dihapus!");
        }
    </script>
    <body>
        <h2>Input Stok Gudang Gadget</h2>
        <form method='GET' action="${pageContext.request.contextPath}/fungsiGudang">
            <table>
                <tr>
                    <td>Produk ID</td>
                    <td>:</td>
                    <td><input class='isiForm' type=text name=idProduk size=10> <a href='showStock'>Lihat Semua</a></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Merk</td>
                    <td>:</td>
                    <td><input class='isiForm' type=text name=merkProduk size=25</td>
                </tr>
                <tr>
                    <td>Tipe</td>
                    <td>:</td>
                    <td><input class='isiForm' type=text name=tipeProduk size=25</td>
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
                    <td><select class='isiForm'name='jenisPlatform'>
                            <option value='Android'>Android</option>
                            <option value='iOS'>iOS</option>
                            <option value='Windows'>Windows</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Harga</td>
                    <td>:</td>
                    <td><input class='isiForm' type=text name=hargaProduk value=''></td>
                </tr>
                <tr>
                    <td>Jumlah</td>
                    <td>:</td>
                    <td><input class='isiForm' type=text name=jumlahProduk value=''></td>
                </tr>
            </table>
            <br>
            <table>
                <tr>
                    <td><button onclick="notifSimpan()" class='Button' type=submit name=button value='simpanButton'>Simpan</button></td>
                    <td><button onclick="notifHapus()" class='Button' type=submit name=button value='updateButton'>Update</button></td>
                    <td><button class='Button' type=submit name=button value='hapusButton'>Hapus</td>
                </tr>
            </table>
        </form>
    </body>
</html>