<%-- 
    Document   : bahan
    Created on : May 17, 2020, 9:30:11 PM
    Author     : Anggi Riantika Dewi
--%>
<%@page import="control.koneksi"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
        <link rel="stylesheet" type="text/css" href="style/style.css" />

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bahan Mamma Masak</title>
    </head>
    <body>
  
      <div id="content">
        <!-- insert the page content here -->
        <form method="POST" action="BahanServlet">
            <h1>Tambah Data Bahan</h1>
            <table>
                <tr><div>
                    <td><label for="inputEmail3">Kode Bahan</label></td>
                    <div class="col-sm-10">
                        <td>
                            <%
                                try {
                                    ResultSet rs = null;
                                    koneksi kon = new koneksi();
                                    rs = kon.stmt.executeQuery("select max(right(kodebahan,4)) as no from bahan");
                                    while (rs.next()) {
                                        if (rs.first() == false) {
                                            out.println("<input type='text' class='form-control' readonly value='BOOO1' name='kodebahan' >");
                                        } else {
                                            rs.last();
                                            int autonokm = rs.getInt(1) + 1;
                                            String nomorkm = String.valueOf(autonokm);
                                            int noLong = nomorkm.length();
                                            for (int a = 1; a < 5 - noLong; a++) {
                                                nomorkm = "0" + nomorkm;
                                            }
                                            String nomerkm = "B" + nomorkm;
                                            out.println("<input type='text' class='form_control' readyonly value='" + nomerkm + "' name='kodebahan'>");
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
                    <td>Nama Bahan</td>
                    <td><input type="text" name="namabahan"></td>
                </tr>
                <tr>
                        <td>Jumlah</td>
                    <td><input type="text" name="jumlah"></td>
                </tr>
                <tr>
                    <td>Kode Supplier</td>
                    <td><input type="text" name="kodesupp"></td>
                </tr>
                <tr>
                    <td>ID User</td>
                    <td><input type="text" name="iduser"></td>
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
                <th>KODE BAHAN</th>
                <th>NAMA BAHAN</th>
                <th>JUMLAH</th>
                <th>KODE SUPPLIER</th>
                <th>ID USER</th>
                <th>AKSI</th>
            </tr>
            <%
                String kodebahan = null;
                String namabahan = null;
                String jumlah = null;
                String kodesupp = null;
                String iduser = null;
                ResultSet rs = null;

                koneksi kon = new koneksi();

                rs = kon.stmt.executeQuery("SELECT * FROM bahan ORDER BY kodebahan asc");
                while (rs.next()) {
                    kodebahan = rs.getString("kodebahan");
                    namabahan = rs.getString(2);
                    jumlah = rs.getString(3);
                    kodesupp = rs.getString(4);
                    iduser = rs.getString(5);

            %>

            <tr>
                <td><% out.println(kodebahan);%></td>
                <td><% out.println(namabahan);%></td>
                <td><% out.println(jumlah);%></td>
                <td><% out.println(kodesupp);%></td>
                <td><% out.println(iduser);%></td>
                <td><a href="beranda.jsp?halaman=editbahan&kodebahan=<% out.println(kodebahan);%>">Lihat Detail</a></td>
            </tr>
            <% } %>

        </table>
        <% kon.close();%>
        
      </div>
</body>
</html>