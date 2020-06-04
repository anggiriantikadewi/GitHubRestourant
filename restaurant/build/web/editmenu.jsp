<%-- 
    Document   : editmenu
    Created on : May 22, 2020, 2:58:17 PM
    Author     : Anggi Riantika Dewi
--%>
<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>
<%
    String kodemenu = request.getParameter("kdmenu");
    String namamenu = null;
    String kodekategori = null;
    String harga = null;
    String stok = null;
    ResultSet rs = null;
    koneksi kon = new koneksi();
    rs = kon.stmt.executeQuery("select * from menu where kdmenu='" + kodemenu + "'");
    if (rs.next()) {
        kodemenu = rs.getString(1);
        namamenu = rs.getString(2);
        kodekategori = rs.getString(3);
        harga = rs.getString(4);
        stok = rs.getString(5);
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ubah Data Mater Menu</title>
    </head>
    <body>
        <form action="ServletMenu" method="POST">
            <table>
                <tr>
                    <td colspan="3">Ubah Data Menu</td>
                </tr>
                <tr>
                    <td>Kode Menu</td>
                    <td>:</td>
                    <td><input type="text" value="<%=kodemenu%>" readonly>
                    <td><input type="hidden" value="<%=kodemenu%>" name="kdmenu">
                    </td>
                </tr>
                <tr>
                    <td>Nama Menu</td>
                    <td>:</td>
                    <td><input type="text" name="nmmenu" value="<%=namamenu%>"></td>
                </tr>
                <tr>
                    <td>Kode Kategori</td>
                    <td>:</td>
                    <td><input type="text" name="kodekategori" value="<%=kodekategori%>"></td>
                </tr>
                <tr>
                    <td>Harga</td>
                    <td>:</td>
                    <td><input type="text" name="harga" value="<%=harga%>"></td>
                </tr>
                <tr>
                    <td>Stok</td>
                    <td>:</td>
                    <td><input type="text" name="stok" value="<%=stok%>"></td>
                </tr>
                <tr>
                    <td colspan="3">
                        <input type="submit" name="aksi" value="Update"> <input type="submit" name="aksi" value="Delete">  <a href="beranda.jsp?halaman=menu">[Lihat Data]</a>
                    </td>
                </tr>
            </table>            
        </form>
    </body>
</html>
