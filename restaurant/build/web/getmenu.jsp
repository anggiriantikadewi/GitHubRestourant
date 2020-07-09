<%-- 
    Document   : getmenu
    Created on : Jun 8, 2020, 9:08:17 PM
    Author     : Anggi Riantika Dewi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*" %> 
<%@page import="control.koneksi"%>
<%@page import="model.menu"%>
<%
    menu menu = new menu();
    koneksi kon = new koneksi(); //--koneksi database--
    ResultSet rs = null;
    String emp_id = request.getParameter("emp_id").toString();
    String data = null;
    Statement st;
    rs = kon.stmt.executeQuery("SELECT * from menu where kdmenu='" + emp_id + "' ");
    while (rs.next()) {
        data = ":" + rs.getString(4) + ":" + emp_id;
        
        
    }
    out.println(data);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>