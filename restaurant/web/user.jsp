<%-- 
    Document   : user
    Created on : May 30, 2020, 12:11:22 PM
    Author     : Anggi Riantika Dewi
--%>
<%@page import="control.koneksi"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style/style.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Mamma Masak</title>
    </head>
    <body>
        <div id="content">
        <form method="POST" action="userServlet">
            <h1>Tambah Data User</h1>
            <table>
                <tr><div>
                    <td><label for="inputEmail3">ID User</label></td>
                    <div class="col-sm-10">
                        <td>
                            <%
                                try {
                                    ResultSet rs = null;
                                    koneksi kon = new koneksi();
                                    rs = kon.stmt.executeQuery("select max(right(id_user,4)) as no from user");
                                    while (rs.next()) {
                                        if (rs.first() == false) {
                                            out.println("<input type='text' class='form-control' readonly value='UOOO1' name='kodeuser' >");
                                        } else {
                                            rs.last();
                                            int autonokm = rs.getInt(1) + 1;
                                            String nomorkm = String.valueOf(autonokm);
                                            int noLong = nomorkm.length();
                                            for (int a = 1; a < 5 - noLong; a++) {
                                                nomorkm = "0" + nomorkm;
                                            }
                                            String nomerkm = "U" + nomorkm;
                                            out.println("<input type='text' class='form_control' readyonly value='" + nomerkm + "' name='kodeuser'>");
                                        }
                                    }
                                } catch (Exception e) {
                                    out.println(e);
                                }
                            %>
                        </td>
                    </div>
                </div>
                </tr>
                <tr>
                    <td>Nama User</td>
                    <td><input type="text" name="namauser"></td>
                </tr>
                <tr>
                    <td>Hak Akses</td>
                    <td><input type="text" name="akses"></td>
                </tr>
                <tr>
                    <td>
                        <input type="reset" value="Batal">
                        <input type="submit" value="Simpan" name="aksi">
                    </td>
                </tr>
            </table>
        </form>
        <br>
        <form action="" method="post">
            Cari Data Bahan : <input type="text" name="cari" value="${param.cari}">
            <input type="submit" value="Cari" class="button"><br>

        </form><br>

        <table border="1">
            <tr align="center">
                <th>ID USER</th>
                <th>NAMA USER</th>
                <th>HAK AKSES</th>
                <th>AKSI</th>
            </tr>
            <%
                String kodeuser = null;
                String namauser = null;
                String akses = null;
                ResultSet rs = null;

                koneksi kon = new koneksi();

                rs = kon.stmt.executeQuery("SELECT * FROM user ORDER BY id_user asc");
                while (rs.next()) {
                    kodeuser = rs.getString("id_user");
                    namauser = rs.getString(2);
                    akses = rs.getString(3);
            %>

            <tr>
                <td><% out.println(kodeuser);%></td>
                <td><% out.println(namauser);%></td>
                <td><% out.println(akses);%></td>
                <td><a href="beranda.jsp?halaman=edituser&kodeuser=<% out.println(kodeuser);%>">Lihat Detail</a></td>
            </tr>
            <% } %>

        </table>
        <% kon.close();%>
        </div>
    </body>
</html>
