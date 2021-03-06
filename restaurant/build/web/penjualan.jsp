<%-- 
    Document   : Pemesanan
    Created on : Jun 27, 2020, 4:45:52 PM
    Author     : Anggi Riantika Dewi
--%>
<%@page import="model.supplier"%>
<%@page import="model.pembelian"%>
<%@page import="control.koneksi"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="model.menu" %>
<%@page import="model.penjualan" %>
<%
    penjualan pemesanan=new penjualan();
    menu menu=new menu();
    supplier supplier=new supplier();
    koneksi kon= new koneksi();
    ResultSet rs=null;
    
%>

<script type="text/javascript">
    function showEmp(emp_value)
    {
        if (document.getElementById("emp_id").value != "-1")
        {
            xmlHttp = GetXmlHttpObject()
            if (xmlHttp == null)
            {
                alert("Browser does not support HTTP Request")
                return
            }
            var url = "getmenu.jsp"
            url = url + "?emp_id=" + emp_value

            xmlHttp.onreadystatechange = stateChanged
            xmlHttp.open("GET", url, true)
            xmlHttp.send(null)
        } else
        {
            alert("Pilih Kode Menu");
        }
    }

    function stateChanged()
    {
        document.getElementById("ename").value = "";
        document.getElementById("emp_id").value = "";
        if (xmlHttp.readyState == 4 || xmlHttp.readyState == "complete")
        {

            var showdata = xmlHttp.responseText;
            var strar = showdata.split(":");

            if (strar.length == 1)
            {
                document.getElementById("emp_id").focus();
                alert("Pilih Kode Menu");
                document.getElementById("ename").value = " ";
                document.getElementById("emp_id").value = " ";
            } else if (strar.length > 1)
            {
                document.getElementById("ename").value = strar[1];
            }

        }
    }

    function GetXmlHttpObject()
    {
        var xmlHttp = null;
        try
        {
            xmlHttp = new XMLHttpRequest();
        } catch (e)
        {
            try
            {
                xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
            } catch (e)
            {
                xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
            }
        }
        return xmlHttp;
    }
</script>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Penjualan Mamma Masak</title>
    </head>
    <body>
        <form method="POST" action="PenjualanServlet">
            <h1>Penjualan Menu</h1>
            <table>
                <tr><div>
                    <td><label for="inputEmail3">No Penjualan</label></td>
                    <div class="col-sm-10">
                        <td>
                            <%
                                try {
                                    
                                    rs = kon.stmt.executeQuery("select max(right(no_jual,4)) as no from penjualan");
                                    while (rs.next()) {
                                        if (rs.first() == false) {
                                            out.println("<input type='text' class='form-control' readonly value='JOOO1' name='no_jual' >");
                                        } else {
                                            rs.last();
                                            int autonokm = rs.getInt(1) + 1;
                                            String nomorkm = String.valueOf(autonokm);
                                            int noLong = nomorkm.length();
                                            for (int a = 1; a < 5 - noLong; a++) {
                                                nomorkm = "0" + nomorkm;
                                            }
                                            String nomerkm = "J" + nomorkm;
                                            out.println("<input type='text' class='form_control' readyonly value='" + nomerkm + "' name='no_jual'>");
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
                <%
                    java.util.Date waktu = new java.util.Date();
                    int tanggal = waktu.getDate();
                    int tahun = waktu.getYear() + 1900;
                    int bulan = waktu.getMonth() + 1;
                    String tgl = tanggal + "-" + bulan + "-" + tahun;

                %>
                <tr>
                    <td>Tanggal Panjualan</td>
                    <td><input type="text" name="tgl_jual" value="<%=tgl%>"</td>
                </tr>
               
                <tr>
                        <td>Pilih Kode Menu</td>
                    <td><select name="semp_id" onchange="showEmp(this.value);">
                            <option value="-1">Select</option> 
                    <%
                        rs = kon.stmt.executeQuery("SELECT * from menu");
                        while (rs.next()) {
                            menu.setKodemenu(rs.getString("kdmenu"));
                            menu.setNamamenu(rs.getString("nmmenu"));
                    %>
                            <option value="<%=menu.getKodemenu()%>"><%=menu.getKodemenu()%> || <%=menu.getNamamenu()%></option>
                    <%  } %>
                        </select></td>
                        <input  type="hidden" name="emp_id" id="emp_id" value="">
                </tr>
                <tr>
                
                    <td>Harga</td>
                    <td><input type="text" readonly name="emp_name" id="ename" value="" onkeyup="sum();"</td>
                    
                </tr>
                
                <tr>
                    <td>QTY</td>
                    <td><input type="text" name="qty_jual" id="jml" onkeyup="sum();"></td>
                </tr>
                <tr>
                    <td>Subtotal</td>
                    <td><input type="text" name="sub_jual" id="subtotal" readonly="readonly"></td>
                </tr>
                
                <script type="text/javascript">
                    function sum(){
                        var txtFirstNumberValue = document.getElementById('ename').value;
                        var txtSecondNumberValue = document.getElementById('jml').value;
                        var result = parseFloat(txtFirstNumberValue) * parseFloat(txtSecondNumberValue);
                        if(!isNaN(result)){
                            document.getElementById('subtotal').value=result;
                        }
                    }
                                    </script>
                <tr>
                    <td>
                        <input type="reset" value="Batal">
                        <input type="submit" value="Simpan" name="aksi">
                    </td>
                </tr>
            </table>
        </form>
                        <br>
       <br>

        <table border="1">
            <tr align="center">
                <th>NO PENJUALAN</th>
                <th>KODE MENU</th>
                <th>QUANTITY</th>
                <th>SUBTOTAL</th>
            </tr>
            <%
                String nojual = null;
                String kodemenu = null;
                String qty = null;
                String subtotal = null;
                
                rs = kon.stmt.executeQuery("SELECT * FROM sementara_jual ORDER BY no_jual asc");
                while (rs.next()) {
                    nojual = rs.getString("no_jual");
                    kodemenu = rs.getString(2);
                    qty = rs.getString(3);
                    subtotal = rs.getString(4);

            %>

            <tr>
                <td><% out.println(nojual);%></td>
                <td><% out.println(kodemenu);%></td>
                <td><% out.println(qty);%></td>
                <td><% out.println(subtotal);%></td>
            </tr>
            <% } %>
            <%
                int subs = 0, sub = 0;
            %>
            <%
                rs = kon.stmt.executeQuery("SELECT * from sementara_jual");
                while (rs.next()) {
                    
                    subs = subs + (Integer.parseInt(rs.getString(3)));
                    sub = sub + (Integer.parseInt(rs.getString(4)));
                    }
            %>
            <tr>
                <td colspan="2"><b align="center">TOTAL</b></td>
                <td><b><% out.println(subs);%></b></td>
                <td><b><% out.println(sub);%></b></td>
            </tr>
            </table>
           <% kon.close();%>
    </body>
</html>
