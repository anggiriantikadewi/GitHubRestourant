<%-- 
    Document   : edituser
    Created on : May 30, 2020, 12:22:18 PM
    Author     : Anggi Riantika Dewi
--%>
<%@page import="control.koneksi" %>
<%@page import="java.sql.*" %>
<%
    String kodeuser = request.getParameter("kodeuser");
    String namauser = null;
    String akses = null;
    ResultSet rs = null;
    koneksi kon = new koneksi();
    rs = kon.stmt.executeQuery("select * from user where id_user='" + kodeuser + "'");
    if (rs.next()) {
        kodeuser = rs.getString(1);
        namauser = rs.getString(2);
        akses = rs.getString(3);
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style/style.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ubah Data Master User</title>
    </head>
    <body>
        <form action="userServlet" method="POST">
            <table>
                <tr>
                    <td colspan="3">Ubah Data User</td>
                </tr>
                <tr>
                    <td>ID user</td>
                    <td>:</td>
                    <td><input type="text" value="<%=kodeuser%>" readonly>
                    <td><input type="hidden" value="<%=kodeuser%>" name="kodeuser">
                    </td>
                </tr>
                <tr>
                    <td>Nama User</td>
                    <td>:</td>
                    <td><input type="text" name="namauser" value="<%=namauser%>"></td>
                </tr>
                <tr>
                    <td>Hak Akses</td>
                    <td>:</td>
                    <td><input type="text" name="akses" value="<%=akses%>"></td>
                </tr>
                <tr>
                    <td colspan="3">
                        <input type="submit" name="aksi" value="Update"> <input type="submit" name="aksi" value="Delete">  <a href="beranda.jsp?halaman=user">[Lihat Data]</a>
                    </td>
                </tr>
            </table>            
        </form>
    </body>
</html>
