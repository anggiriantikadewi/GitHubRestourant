<%-- 
    Document   : beranda
    Created on : May 22, 2020, 1:52:07 PM
    Author     : Anggi Riantika Dewi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style/style.css" />

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Restauran Mamma Masak</title>
    </head>
    <body>
  <div id="main">
    <div id="header">
      <div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h1><a href="beranda.jsp">Restauran<span class="logo_colour">Mamma Masak</span></a></h1>
          <h2>Makanan Minuman Enakkkkk!</h2>
        </div>
      </div>
      <div id="menubar">
        <ul id="menu">
          <!-- put class="selected" in the li tag for the selected page - to highlight which page you're on -->
          <li><a href="beranda.jsp">Home</a></li>
          <li><a href="beranda.jsp?halaman=menu">Menu</a></li>
          <li><a href="beranda.jsp?halaman=bahan">Bahan</a></li>
          <li><a href="beranda.jsp?halaman=supplier">Supplier</a></li>
          <li><a href="beranda.jsp?halaman=pembelian">Pembelian</a></li>
          <li><a href="beranda.jsp?halaman=penjualan">Penjualan</a></li>
          <li><a href="beranda.jsp?halaman=user">User</a></li>
        </ul>
      </div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
      <div id="banner"></div>
	  <div id="sidebar_container">
        <div class="sidebar">
          <div class="sidebar_top"></div>
          <div class="sidebar_item">
            <!-- insert your sidebar items here -->
            <h3>Latest News</h3>
            <h4>RESTAURANT MAMMA MASAK</h4>
            <h5>February 1st, 2010</h5>
            <p>Mamma Masak adalah perusahaan yang bergerak dibidang penjualan makanan dan minuman. Berdiri sejak tahun 2010 dan didirikan oleh Ibu Marwah Rianti dengan memiliki 6 karyawan dengan bagian masing masing. .<br /><a href="#">Read more</a></p>
          </div>
          <div class="sidebar_base"></div>
        </div>
        <div class="sidebar">
          <div class="sidebar_top"></div>
          <div class="sidebar_item">
            <h3>Laporan</h3>
            <ul>
              <li><a href="beranda.jsp?halaman=lapbahan">Laporan Bahan</a></li>
              <li><a href="beranda.jsp?halaman=lapmenu">Laporan Menu</a></li>
              <li><a href="beranda.jsp?halaman=lapsupplier">Laporan Supplier</a></li>
              <li><a href="beranda.jsp?halaman=lappembelian">Laporan Pembelian</a></li>
              <li><a href="beranda.jsp?halaman=lappenjualan">Laporan Penjualan</a></li>
              <li><a href="beranda.jsp?halaman=lapuser">Laporan User</a></li>
             
            </ul>
          </div>
          <div class="sidebar_base"></div>
        </div>
        
      </div>
      <div id="content">
        <!-- insert the page content here -->
        <c:choose>
            <c:when test="${param.halaman=='home'}">
                <%@include file="home.jsp" %>
            </c:when>
            <c:when test="${param.halaman=='bahan'}">
                <%@include file="bahan.jsp" %>
            </c:when>
            <c:when test="${param.halaman=='pembelian'}">
                <%@include file="pembelian.jsp" %>
            </c:when>
            <c:when test="${param.halaman=='penjualan'}">
                <%@include file="penjualan.jsp" %>
            </c:when>
            <c:when test="${param.halaman=='editbahan'}">
                <%@include file="editbahan.jsp" %>
            </c:when>
            <c:when test="${param.halaman=='tampilbhn'}">
                <%@include file="bahan.jsp" %>
            </c:when>
            <c:when test="${param.halaman=='menu'}">
                <%@include file="menu.jsp" %>
            </c:when>
            <c:when test="${param.halaman=='editmenu'}">
                <%@include file="editmenu.jsp" %>
            </c:when>
            <c:when test="${param.halaman=='supplier'}">
                <%@include file="supplier.jsp" %>
            </c:when>
            <c:when test="${param.halaman=='editsupp'}">
                <%@include file="editsupplier.jsp" %>
            </c:when>
            <c:when test="${param.halaman=='user'}">
                <%@include file="user.jsp" %>
            </c:when>
            <c:when test="${param.halaman=='edituser'}">
                <%@include file="edituser.jsp" %>
            </c:when>
            <c:when test="${param.halaman=='lapbahan'}">
                <%@include file="CetakLaporanBahan.jsp" %>
            </c:when>
            <c:when test="${param.halaman=='lapmenu'}">
                <%@include file="CetakLapMenu.jsp" %>
            </c:when>
            <c:otherwise>
                <%@include file="home.jsp" %>
            </c:otherwise>
        </c:choose>
        
      </div>
    </div>
    <div id="content_footer"></div>
    <div id="footer">
      <p>Anggi Riantika Dewi, Amalia Syifa, Fenti Yulya Halim, Nada Horiah, Paskah Harianja</p>
      <p>Restaurant Mamma Masak <br>
      By. Anggi Riantika Dewi</p>
    </div>
  </div>
</body>
</html>
