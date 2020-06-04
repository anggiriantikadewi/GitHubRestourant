<%-- 
    Document   : editsupplier
    Created on : May 30, 2020, 11:55:13 AM
    Author     : Anggi Riantika Dewi
--%>
<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String kodesupp = request.getParameter("kodesupp");
    String namasupp = null;
    String alamat = null;
    String telp = null;
    ResultSet rs = null;
    koneksi kon = new koneksi();
    rs = kon.stmt.executeQuery("select * from supplier where kd_supp='" + kodesupp + "'");
    if (rs.next()) {
        kodesupp = rs.getString(1);
        namasupp = rs.getString(2);
        alamat = rs.getString(3);
        telp = rs.getString(4);
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ubah Data Mater Supplier</title>
    </head>
    <body>
        <form action="SuppServlet" method="POST">
            <table>
                <tr>
                    <td colspan="3">Ubah Data Supplier</td>
                </tr>
                <tr>
                    <td>Kode Supplier</td>
                    <td>:</td>
                    <td><input type="text" value="<%=kodesupp%>" readonly>
                    <td><input type="hidden" value="<%=kodesupp%>" name="kodesupp">
                    </td>
                </tr>
                <tr>
                    <td>Nama Supplier</td>
                    <td>:</td>
                    <td><input type="text" name="namasupp" value="<%=namasupp%>"></td>
                </tr>
                <tr>
                    <td>Alamat</td>
                    <td>:</td>
                    <td><input type="text" name="alamat" value="<%=alamat%>"></td>
                </tr>
                <tr>
                    <td>Telepon</td>
                    <td>:</td>
                    <td><input type="text" name="telp" value="<%=telp%>"></td>
                </tr>
                <tr>
                    <td colspan="3">
                        <input type="submit" name="aksi" value="Update"> <input type="submit" name="aksi" value="Delete">  <a href="beranda.jsp?halaman=supplier">[Lihat Data]</a>
                    </td>
                </tr>
            </table>            
        </form>
    </body>
</html>
