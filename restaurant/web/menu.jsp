<%-- 
    Document   : menu
    Created on : May 22, 2020, 2:41:02 PM
    Author     : Anggi Riantika Dewi
--%>
<%@page import="java.sql.SQLException"%>
<%@page import="control.koneksi"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Mamma Masak</title>
    </head>
    <body>
        <form method="POST" action="ServletMenu">
            <h1>Tambah Data Menu</h1>
            <table>
                <tr><div>
                    <td><label for="inputEmail3">Kode Menu</label></td>
                    <div class="col-sm-10">
                        <td>
                            <%
                                try {
                                    ResultSet rs = null;
                                    koneksi kon = new koneksi();
                                    rs = kon.stmt.executeQuery("select max(right(kdmenu,4)) as no from menu");
                                    while (rs.next()) {
                                        if (rs.first() == false) {
                                            out.println("<input type='text' class='form-control' readonly value='MOOO1' name='kdmenu' >");
                                        } else {
                                            rs.last();
                                            int autonokm = rs.getInt(1) + 1;
                                            String nomorkm = String.valueOf(autonokm);
                                            int noLong = nomorkm.length();
                                            for (int a = 1; a < 5 - noLong; a++) {
                                                nomorkm = "0" + nomorkm;
                                            }
                                            String nomerkm = "M" + nomorkm;
                                            out.println("<input type='text' class='form_control' readyonly value='" + nomerkm + "' name='kdmenu'>");
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
                    <td>Nama Menu</td>
                    <td><input type="text" name="nmmenu"></td>
                </tr>
                <tr>
                        <td>Kode Kategori</td>
                    <td>
                        <select name="kodekategori">
                            <option value="">Pilih Kategori</option>
                            <option value="K0001">Makanan</option>
                            <option value="K0002">Minuman</option>
                        </select></td>
                    
                <tr>
                    <td>Harga</td>
                    <td><input type="text" name="harga"></td>
                </tr>
                <tr>
                    <td>Stok</td>
                    <td><input type="text" name="stok"></td>
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
            Cari Data Menu : <input type="text" name="cari" value="${param.cari}">
            <input type="submit" value="Cari" class="button"><br>

        </form><br>

        <table border="1">
            <tr align="center">
                <th>KODE MENU</th>
                <th>NAMA MENU</th>
                <th>KODE KATEGORI</th>
                <th>HARGA</th>                
                <th>STOK</th>
                <th>AKSI</th>
            </tr>
            <%
                String kodemenu = null;
                String namamenu = null;
                String kodekategori = null;
                String harga = null;
                String stok = null;
                ResultSet rs = null;

                koneksi kon = new koneksi();

                rs = kon.stmt.executeQuery("SELECT * FROM menu ORDER BY kdmenu asc");
                while (rs.next()) {
                    kodemenu = rs.getString("kdmenu");
                    namamenu = rs.getString(2);
                    kodekategori = rs.getString(3);
                    harga = rs.getString(4);
                    stok = rs.getString(5);

            %>

            <tr>
                <td><% out.println(kodemenu);%></td>
                <td><% out.println(namamenu);%></td>
                <td><% out.println(kodekategori);%></td>
                <td><% out.println(harga);%></td>
                <td><% out.println(stok);%></td>
                <td><a href="beranda.jsp?halaman=editmenu&kdmenu=<% out.println(kodemenu);%>">Lihat Detail</a></td>
            </tr>
            <% } %>

        </table>
        <% kon.close();%>
        
    </body>
</html>
