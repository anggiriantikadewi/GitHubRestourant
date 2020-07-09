package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.supplier;
import model.pembelian;
import control.koneksi;
import java.sql.ResultSet;
import model.menu;
import model.penjualan;

public final class penjualan_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    penjualan pemesanan=new penjualan();
    menu menu=new menu();
    supplier supplier=new supplier();
    koneksi kon= new koneksi();
    ResultSet rs=null;
    

      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function showEmp(emp_value)\n");
      out.write("    {\n");
      out.write("        if (document.getElementById(\"emp_id\").value != \"-1\")\n");
      out.write("        {\n");
      out.write("            xmlHttp = GetXmlHttpObject()\n");
      out.write("            if (xmlHttp == null)\n");
      out.write("            {\n");
      out.write("                alert(\"Browser does not support HTTP Request\")\n");
      out.write("                return\n");
      out.write("            }\n");
      out.write("            var url = \"getmenu.jsp\"\n");
      out.write("            url = url + \"?emp_id=\" + emp_value\n");
      out.write("\n");
      out.write("            xmlHttp.onreadystatechange = stateChanged\n");
      out.write("            xmlHttp.open(\"GET\", url, true)\n");
      out.write("            xmlHttp.send(null)\n");
      out.write("        } else\n");
      out.write("        {\n");
      out.write("            alert(\"Pilih Kode Menu\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function stateChanged()\n");
      out.write("    {\n");
      out.write("        document.getElementById(\"ename\").value = \"\";\n");
      out.write("        document.getElementById(\"emp_id\").value = \"\";\n");
      out.write("        if (xmlHttp.readyState == 4 || xmlHttp.readyState == \"complete\")\n");
      out.write("        {\n");
      out.write("\n");
      out.write("            var showdata = xmlHttp.responseText;\n");
      out.write("            var strar = showdata.split(\":\");\n");
      out.write("\n");
      out.write("            if (strar.length == 1)\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"emp_id\").focus();\n");
      out.write("                alert(\"Pilih Kode Menu\");\n");
      out.write("                document.getElementById(\"ename\").value = \" \";\n");
      out.write("                document.getElementById(\"emp_id\").value = \" \";\n");
      out.write("            } else if (strar.length > 1)\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"ename\").value = strar[1];\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function GetXmlHttpObject()\n");
      out.write("    {\n");
      out.write("        var xmlHttp = null;\n");
      out.write("        try\n");
      out.write("        {\n");
      out.write("            xmlHttp = new XMLHttpRequest();\n");
      out.write("        } catch (e)\n");
      out.write("        {\n");
      out.write("            try\n");
      out.write("            {\n");
      out.write("                xmlHttp = new ActiveXObject(\"Msxml2.XMLHTTP\");\n");
      out.write("            } catch (e)\n");
      out.write("            {\n");
      out.write("                xmlHttp = new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        return xmlHttp;\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Penjualan Mamma Masak</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"POST\" action=\"PenjualanServlet\">\n");
      out.write("            <h1>Penjualan Menu</h1>\n");
      out.write("            <table>\n");
      out.write("                <tr><div>\n");
      out.write("                    <td><label for=\"inputEmail3\">No Penjualan</label></td>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <td>\n");
      out.write("                            ");

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
                            
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    java.util.Date waktu = new java.util.Date();
                    int tanggal = waktu.getDate();
                    int tahun = waktu.getYear() + 1900;
                    int bulan = waktu.getMonth() + 1;
                    String tgl = tanggal + "-" + bulan + "-" + tahun;

                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>Tanggal Panjualan</td>\n");
      out.write("                    <td><input type=\"text\" name=\"tgl_jual\" value=\"");
      out.print(tgl);
      out.write("\"</td>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                        <td>Pilih Kode Menu</td>\n");
      out.write("                    <td><select name=\"semp_id\" onchange=\"showEmp(this.value);\">\n");
      out.write("                            <option value=\"-1\">Select</option> \n");
      out.write("                    ");

                        rs = kon.stmt.executeQuery("SELECT * from menu");
                        while (rs.next()) {
                            menu.setKodemenu(rs.getString("kdmenu"));
                            menu.setNamamenu(rs.getString("nmmenu"));
                    
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(menu.getKodemenu());
      out.write('"');
      out.write('>');
      out.print(menu.getKodemenu());
      out.write(" || ");
      out.print(menu.getNamamenu());
      out.write("</option>\n");
      out.write("                    ");
  } 
      out.write("\n");
      out.write("                        </select></td>\n");
      out.write("                        <input  type=\"hidden\" name=\"emp_id\" id=\"emp_id\" value=\"\">\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                \n");
      out.write("                    <td>Harga</td>\n");
      out.write("                    <td><input type=\"text\" readonly name=\"emp_name\" id=\"ename\" value=\"\" onkeyup=\"sum();\"</td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>QTY</td>\n");
      out.write("                    <td><input type=\"text\" name=\"qty_jual\" id=\"jml\" onkeyup=\"sum();\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Subtotal</td>\n");
      out.write("                    <td><input type=\"text\" name=\"sub_jual\" id=\"subtotal\" readonly=\"readonly\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write("                    function sum(){\n");
      out.write("                        var txtFirstNumberValue = document.getElementById('ename').value;\n");
      out.write("                        var txtSecondNumberValue = document.getElementById('jml').value;\n");
      out.write("                        var result = parseFloat(txtFirstNumberValue) * parseFloat(txtSecondNumberValue);\n");
      out.write("                        if(!isNaN(result)){\n");
      out.write("                            document.getElementById('subtotal').value=result;\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                                    </script>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"reset\" value=\"Batal\">\n");
      out.write("                        <input type=\"submit\" value=\"Simpan\" name=\"aksi\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("                        <br>\n");
      out.write("        <form action=\"\" method=\"post\">\n");
      out.write("            Cari Data Bahan : <input type=\"text\" name=\"cari\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <input type=\"submit\" value=\"Cari\" class=\"button\"><br>\n");
      out.write("\n");
      out.write("        </form><br>\n");
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr align=\"center\">\n");
      out.write("                <th>NO PENJUALAN</th>\n");
      out.write("                <th>KODE MENU</th>\n");
      out.write("                <th>QUANTITY</th>\n");
      out.write("                <th>SUBTOTAL</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

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

            
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
 out.println(nojual);
      out.write("</td>\n");
      out.write("                <td>");
 out.println(kodemenu);
      out.write("</td>\n");
      out.write("                <td>");
 out.println(qty);
      out.write("</td>\n");
      out.write("                <td>");
 out.println(subtotal);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("        ");
 kon.close();
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
