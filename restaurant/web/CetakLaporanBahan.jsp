<%-- 
    Document   : CetakLaporanBahan
    Created on : Jul 5, 2020, 8:41:49 PM
    Author     : Anggi Riantika Dewi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Cetak Laporan Barang Berdasarkan Stok Tersedia</h3>
        <form action="TampilLaporanBahan.jsp" method="get">
            Stok <= <input type="number" name="jumlah" value="0">
            <input type="submit" name="submit" value="Cetak Laporan"/>
        </form>
    </body>
</html>
