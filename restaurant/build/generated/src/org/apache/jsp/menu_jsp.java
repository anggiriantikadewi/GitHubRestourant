package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.koneksi;
import java.sql.ResultSet;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Menu Mamma Masak</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"POST\" action=\"ServletMenu\">\n");
      out.write("            <h1>Tambah Data Menu</h1>\n");
      out.write("            <table>\n");
      out.write("                <tr><div>\n");
      out.write("                    <td><label for=\"inputEmail3\">Kode Menu</label></td>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <td>\n");
      out.write("                            ");

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
                            
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nama Menu</td>\n");
      out.write("                    <td><input type=\"text\" name=\"nmmenu\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                        <td>Kode Kategori</td>\n");
      out.write("                    <td><input type=\"text\" name=\"kodekategori\"></td>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Harga</td>\n");
      out.write("                    <td><input type=\"text\" name=\"harga\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Stok</td>\n");
      out.write("                    <td><input type=\"text\" name=\"stok\"></td>\n");
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
      out.write("            Cari Data Menu : <input type=\"text\" name=\"cari\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <input type=\"submit\" value=\"Cari\" class=\"button\"><br>\n");
      out.write("\n");
      out.write("        </form><br>\n");
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr align=\"center\">\n");
      out.write("                <th>KODE MENU</th>\n");
      out.write("                <th>NAMA MENU</th>\n");
      out.write("                <th>KODE KATEGORI</th>\n");
      out.write("                <th>HARGA</th>\n");
      out.write("                <th>STOK</th>\n");
      out.write("                <th>AKSI</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                String kodemeu = null;
                String namamenu = null;
                String kodekategori = null;
                String harga = null;
                String stok = null;
                ResultSet rs = null;

                koneksi kon = new koneksi();

                rs = kon.stmt.executeQuery("SELECT * FROM menu ORDER BY kdmenu asc");
                while (rs.next()) {
                    kodemeu = rs.getString("kdmenu");
                    namamenu = rs.getString(2);
                    kodekategori = rs.getString(3);
                    harga = rs.getString(4);
                    stok = rs.getString(5);

            
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
 out.println(kodemeu);
      out.write("</td>\n");
      out.write("                <td>");
 out.println(namamenu);
      out.write("</td>\n");
      out.write("                <td>");
 out.println(kodekategori);
      out.write("</td>\n");
      out.write("                <td>");
 out.println(harga);
      out.write("</td>\n");
      out.write("                <td>");
 out.println(stok);
      out.write("</td>\n");
      out.write("                <td><a href=\"beranda.jsp?halaman=editmenu&kodemenu=");
 out.println(kodemeu);
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
      out.write("        \n");
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
