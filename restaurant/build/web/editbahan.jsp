<%-- 
    Document   : editbahan
    Created on : May 18, 2020, 2:19:30 PM
    Author     : Anggi Riantika Dewi
--%>
<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>
<%
    String kodebahan = request.getParameter("kodebahan");
    String namabahan = null;
    String jumlah = null;
    String kodesupp = null;
    String iduser = null;
    ResultSet rs = null;
    koneksi kon = new koneksi();
    rs = kon.stmt.executeQuery("select * from bahan where kodebahan='" + kodebahan + "'");
    if (rs.next()) {
        kodebahan = rs.getString(1);
        namabahan = rs.getString(2);
        jumlah = rs.getString(3);
        kodesupp = rs.getString(4);
        iduser = rs.getString(5);
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ubah Data Mater Bahan</title>
    </head>
    <body>
        <form action="BahanServlet" method="POST">
            <table>
                <tr>
                    <td colspan="3">Ubah Data Bahan</td>
                </tr>
                <tr>
                    <td>Kode Bahan</td>
                    <td>:</td>
                    <td><input type="text" value="<%=kodebahan%>" readonly>
                    <td><input type="hidden" value="<%=kodebahan%>" name="kodebahan">
                    </td>
                </tr>
                <tr>
                    <td>Nama Bahan</td>
                    <td>:</td>
                    <td><input type="text" name="namabahan" value="<%=namabahan%>"></td>
                </tr>
                <tr>
                    <td>Jumlah</td>
                    <td>:</td>
                    <td><input type="text" name="jumlah" value="<%=jumlah%>"></td>
                </tr>
                <tr>
                    <td>Kode Supplier</td>
                    <td>:</td>
                    <td><input type="text" name="kodesupp" value="<%=kodesupp%>"></td>
                </tr>
                <tr>
                    <td>ID User</td>
                    <td>:</td>
                    <td><input type="text" name="iduser" value="<%=iduser%>"></td>
                </tr>
                <tr>
                    <td colspan="3">
                        <input type="submit" name="aksi" value="Update"> <input type="submit" name="aksi" value="Delete">  <a href="beranda.jsp?halaman=tampilbhn">[Lihat Data]</a>
                    </td>
                </tr>
            </table>            
        </form>
    </body>
</html>
