package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.koneksi;
import java.sql.ResultSet;

public final class supplier_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Supplier Mamma Masak</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"POST\" action=\"SuppServlet\">\n");
      out.write("            <h1>Tambah Data Supplier</h1>\n");
      out.write("            <table>\n");
      out.write("                <tr><div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                    <td><label for=\"inputEmail3\">Kode Supplier</label></td>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <td>\n");
      out.write("                            ");

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
                            
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nama Supplier</td>\n");
      out.write("                    <td><input type=\"text\" name=\"namasupp\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                        <td>Alamat</td>\n");
      out.write("                    <td><input type=\"text\" name=\"alamat\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Telepon</td>\n");
      out.write("                    <td><input type=\"text\" name=\"telp\"></td>\n");
      out.write("                </tr>\n");
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
      out.write("                <th>KODE SUPPLIER</th>\n");
      out.write("                <th>NAMA SUPPLIER</th>\n");
      out.write("                <th>ALAMAT</th>\n");
      out.write("                <th>TELEPON</th>\n");
      out.write("                <th>AKSI</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

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

            
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
 out.println(kodesupp);
      out.write("</td>\n");
      out.write("                <td>");
 out.println(namasupp);
      out.write("</td>\n");
      out.write("                <td>");
 out.println(alamat);
      out.write("</td>\n");
      out.write("                <td>");
 out.println(telp);
      out.write("</td>\n");
      out.write("                <td><a href=\"beranda.jsp?halaman=editsupp&kodesupp=");
 out.println(kodesupp);
      out.write("\">Lihat Detail</a></td>\n");
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
