<%-- 
    Document   : proseslogin
    Created on : Jul 5, 2020, 3:09:56 PM
    Author     : Anggi Riantika Dewi
--%>
<%@page import="control.koneksi"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        String userid = request.getParameter("username");
        String pwd = request.getParameter("pass");
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/retaurant","root", "");
Statement st = con.createStatement();
ResultSet rs;
rs = st.executeQuery("select * from user where username='" + userid + "' and nm_user='" + pwd + "'");
if (rs.next()) {session.setAttribute("userid", userid);
out.println("welcome " + userid);
out.println("<a href='logout.jsp'>Log out</a>");
response.sendRedirect("sukses.jsp");
} else {out.println("Invalid password <a href='index.jsp'>try again</a>");} 

    </body>
</html>
