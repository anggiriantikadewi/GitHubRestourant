<%-- 
    Document   : CetakLapMenu
    Created on : Jun 28, 2020, 7:43:34 PM
    Author     : Anggi Riantika Dewi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cetak Laporan Menu</title>
    </head>
    <body>
        <h3>Cetak Laporan Menu Berdasarkan Jumlah Tersedia</h3>
        <form action="TampilLapMenu.jsp" method="get">
            Jumlah <= <input type="number" name="jumlah" value="0">
            <input type="submit" name="submit" value="Cetak Laporan"/>
        </form>
    </body>
</html>
