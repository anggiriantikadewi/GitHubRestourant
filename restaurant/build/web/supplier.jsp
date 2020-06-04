<%-- 
    Document   : supplier
    Created on : May 30, 2020, 11:30:30 AM
    Author     : Anggi Riantika Dewi
--%>
<%@page import="control.koneksi"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Supplier Mamma Masak</title>
    </head>
    <body>
        <form method="POST" action="SuppServlet">
            <h1>Tambah Data Supplier</h1>
            <table>
                <tr><div>
                    
                </div>
                    <td><label for="inputEmail3">Kode Supplier</label></td>
                    <div class="col-sm-10">
                        <td>
                            <%
                                try {
                                    ResultSet rs = null;
                                    koneksi kon = new koneksi();
                                    rs = kon.stmt.executeQuery("select max(right(kd_supp,4)) as no from supplier");
                                    while (rs.next()) {
                                        if (rs.first() == false) {
                                            out.println("<input type='text' class='form-control' readonly value='SOOO1' name='kodesupp' >");
                                        } else {
                                            rs.last();
                                            int autonokm = rs.getInt(1) + 1;
                                            String nomorkm = String.valueOf(autonokm);
                                            int noLong = nomorkm.length();
                                            for (int a = 1; a < 5 - noLong; a++) {
                                                nomorkm = "0" + nomorkm;
                                            }
                                            String nomerkm = "S" + nomorkm;
                                            out.println("<input type='text' class='form_control' readyonly value='" + nomerkm + "' name='kodesupp'>");
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
                    <td>Nama Supplier</td>
                    <td><input type="text" name="namasupp"></td>
                </tr>
                <tr>
                        <td>Alamat</td>
                    <td><input type="text" name="alamat"></td>
                </tr>
                <tr>
                    <td>Telepon</td>
                    <td><input type="text" name="telp"></td>
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
                <th>KODE SUPPLIER</th>
                <th>NAMA SUPPLIER</th>
                <th>ALAMAT</th>
                <th>TELEPON</th>
                <th>AKSI</th>
            </tr>
            <%
                String kodesupp = null;
                String namasupp = null;
                String alamat = null;
                String telp = null;
                ResultSet rs = null;

                koneksi kon = new koneksi();

                rs = kon.stmt.executeQuery("SELECT * FROM supplier ORDER BY kd_supp asc");
                while (rs.next()) {
                    kodesupp = rs.getString("kd_supp");
                    namasupp = rs.getString(2);
                    alamat = rs.getString(3);
                    telp = rs.getString(4);

            %>

            <tr>
                <td><% out.println(kodesupp);%></td>
                <td><% out.println(namasupp);%></td>
                <td><% out.println(alamat);%></td>
                <td><% out.println(telp);%></td>
                <td><a href="beranda.jsp?halaman=editsupp&kodesupp=<% out.println(kodesupp);%>">Lihat Detail</a></td>
            </tr>
            <% } %>

        </table>
        <% kon.close();%>
    </body>
</html>
