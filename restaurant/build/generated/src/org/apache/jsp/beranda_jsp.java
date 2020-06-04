package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.koneksi;
import java.sql.ResultSet;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import control.koneksi;
import java.sql.ResultSet;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.ResultSet;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.ResultSet;
import control.koneksi;
import java.sql.*;

public final class beranda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(9);
    _jspx_dependants.add("/home.jsp");
    _jspx_dependants.add("/bahan.jsp");
    _jspx_dependants.add("/editbahan.jsp");
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/editmenu.jsp");
    _jspx_dependants.add("/supplier.jsp");
    _jspx_dependants.add("/editsupplier.jsp");
    _jspx_dependants.add("/user.jsp");
    _jspx_dependants.add("/edituser.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\" />\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Restauran Mamma Masak</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("  <div id=\"main\">\n");
      out.write("    <div id=\"header\">\n");
      out.write("      <div id=\"logo\">\n");
      out.write("        <div id=\"logo_text\">\n");
      out.write("          <!-- class=\"logo_colour\", allows you to change the colour of the text -->\n");
      out.write("          <h1><a href=\"beranda.jsp\">Restauran<span class=\"logo_colour\">Mamma Masak</span></a></h1>\n");
      out.write("          <h2>Food. Drinks. Snack.</h2>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"menubar\">\n");
      out.write("        <ul id=\"menu\">\n");
      out.write("          <!-- put class=\"selected\" in the li tag for the selected page - to highlight which page you're on -->\n");
      out.write("          <li><a href=\"beranda.jsp\">Home</a></li>\n");
      out.write("          <li><a href=\"beranda.jsp?halaman=menu\">Menu</a></li>\n");
      out.write("          <li><a href=\"beranda.jsp?halaman=bahan\">Bahan</a></li>\n");
      out.write("          <li><a href=\"beranda.jsp?halaman=supplier\">Supplier</a></li>\n");
      out.write("          <li><a href=\"beranda.jsp?halaman=user\">User</a></li>\n");
      out.write("          <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"content_header\"></div>\n");
      out.write("    <div id=\"site_content\">\n");
      out.write("      <div id=\"banner\"></div>\n");
      out.write("\t  <div id=\"sidebar_container\">\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("          <div class=\"sidebar_top\"></div>\n");
      out.write("          <div class=\"sidebar_item\">\n");
      out.write("            <!-- insert your sidebar items here -->\n");
      out.write("            <h3>Latest News</h3>\n");
      out.write("            <h4>New Website Launched</h4>\n");
      out.write("            <h5>February 1st, 2014</h5>\n");
      out.write("            <p>2014 sees the redesign of our website. Take a look around and let us know what you think.<br /><a href=\"#\">Read more</a></p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"sidebar_base\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("          <div class=\"sidebar_top\"></div>\n");
      out.write("          <div class=\"sidebar_item\">\n");
      out.write("            <h3>Useful Links</h3>\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"#\">link 1</a></li>\n");
      out.write("              <li><a href=\"#\">link 2</a></li>\n");
      out.write("              <li><a href=\"#\">link 3</a></li>\n");
      out.write("              <li><a href=\"#\">link 4</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"sidebar_base\"></div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      <div id=\"content\">\n");
      out.write("        <!-- insert the page content here -->\n");
      out.write("        ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_1.setPageContext(_jspx_page_context);
          _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='bahan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
          if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<head>\n");
              out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\" />\n");
              out.write("\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <title>Bahan Mamma Masak</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("  \n");
              out.write("      <div id=\"content\">\n");
              out.write("        <!-- insert the page content here -->\n");
              out.write("        <form method=\"POST\" action=\"BahanServlet\">\n");
              out.write("            <h1>Tambah Data Bahan</h1>\n");
              out.write("            <table>\n");
              out.write("                <tr><div>\n");
              out.write("                    <td><label for=\"inputEmail3\">Kode Bahan</label></td>\n");
              out.write("                    <div class=\"col-sm-10\">\n");
              out.write("                        <td>\n");
              out.write("                            ");

                                try {
                                    ResultSet rs = null;
                                    koneksi kon = new koneksi();
                                    rs = kon.stmt.executeQuery("select max(right(kodebahan,4)) as no from bahan");
                                    while (rs.next()) {
                                        if (rs.first() == false) {
                                            out.println("<input type='text' class='form-control' readonly value='BOOO1' name='kodebahan' >");
                                        } else {
                                            rs.last();
                                            int autonokm = rs.getInt(1) + 1;
                                            String nomorkm = String.valueOf(autonokm);
                                            int noLong = nomorkm.length();
                                            for (int a = 1; a < 5 - noLong; a++) {
                                                nomorkm = "0" + nomorkm;
                                            }
                                            String nomerkm = "B" + nomorkm;
                                            out.println("<input type='text' class='form_control' readyonly value='" + nomerkm + "' name='kodebahan'>");
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
              out.write("                    <td>Nama Bahan</td>\n");
              out.write("                    <td><input type=\"text\" name=\"namabahan\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                        <td>Jumlah</td>\n");
              out.write("                    <td><input type=\"text\" name=\"jumlah\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Kode Supplier</td>\n");
              out.write("                    <td><input type=\"text\" name=\"kodesupp\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>ID User</td>\n");
              out.write("                    <td><input type=\"text\" name=\"iduser\"></td>\n");
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
              out.write("                <th>KODE BAHAN</th>\n");
              out.write("                <th>NAMA BAHAN</th>\n");
              out.write("                <th>JUMLAH</th>\n");
              out.write("                <th>KODE SUPPLIER</th>\n");
              out.write("                <th>ID USER</th>\n");
              out.write("                <th>AKSI</th>\n");
              out.write("            </tr>\n");
              out.write("            ");

                String kodebahan = null;
                String namabahan = null;
                String jumlah = null;
                String kodesupp = null;
                String iduser = null;
                ResultSet rs = null;

                koneksi kon = new koneksi();

                rs = kon.stmt.executeQuery("SELECT * FROM bahan ORDER BY kodebahan asc");
                while (rs.next()) {
                    kodebahan = rs.getString("kodebahan");
                    namabahan = rs.getString(2);
                    jumlah = rs.getString(3);
                    kodesupp = rs.getString(4);
                    iduser = rs.getString(5);

            
              out.write("\n");
              out.write("\n");
              out.write("            <tr>\n");
              out.write("                <td>");
 out.println(kodebahan);
              out.write("</td>\n");
              out.write("                <td>");
 out.println(namabahan);
              out.write("</td>\n");
              out.write("                <td>");
 out.println(jumlah);
              out.write("</td>\n");
              out.write("                <td>");
 out.println(kodesupp);
              out.write("</td>\n");
              out.write("                <td>");
 out.println(iduser);
              out.write("</td>\n");
              out.write("                <td><a href=\"beranda.jsp?halaman=editbahan&kodebahan=");
 out.println(kodebahan);
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
              out.write("      </div>\n");
              out.write("</body>\n");
              out.write("</html>");
              out.write("\n");
              out.write("            ");
              int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
          out.write("\n");
          out.write("            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_2.setPageContext(_jspx_page_context);
          _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='editbahan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
          if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                ");
              out.write("\n");
              out.write("\n");
              out.write("\n");

    String kodebahan = request.getParameter("kodebahan");
    String namabahan = null;
    String jumlah = null;
    String kodesupp = null;
    String iduser = null;
    ResultSet rs = null;
    koneksi kon = new koneksi();
    rs = kon.stmt.executeQuery("select * from bahan where kodebahan='" + kodebahan + "'");
    if (rs.next()) {
        kodebahan = rs.getString(1);
        namabahan = rs.getString(2);
        jumlah = rs.getString(3);
        kodesupp = rs.getString(4);
        iduser = rs.getString(5);
    }

              out.write("\n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <title>Ubah Data Mater Bahan</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("        <form action=\"BahanServlet\" method=\"POST\">\n");
              out.write("            <table>\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"3\">Ubah Data Bahan</td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Kode Bahan</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" value=\"");
              out.print(kodebahan);
              out.write("\" readonly>\n");
              out.write("                    <td><input type=\"hidden\" value=\"");
              out.print(kodebahan);
              out.write("\" name=\"kodebahan\">\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Nama Bahan</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" name=\"namabahan\" value=\"");
              out.print(namabahan);
              out.write("\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Jumlah</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" name=\"jumlah\" value=\"");
              out.print(jumlah);
              out.write("\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Kode Supplier</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" name=\"kodesupp\" value=\"");
              out.print(kodesupp);
              out.write("\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>ID User</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" name=\"iduser\" value=\"");
              out.print(iduser);
              out.write("\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"3\">\n");
              out.write("                        <input type=\"submit\" name=\"aksi\" value=\"Update\"> <input type=\"submit\" name=\"aksi\" value=\"Delete\">  <a href=\"beranda.jsp?halaman=tampilbhn\">[Lihat Data]</a>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("            </table>            \n");
              out.write("        </form>\n");
              out.write("    </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("            ");
              int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
          out.write("\n");
          out.write("            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_3.setPageContext(_jspx_page_context);
          _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='tampilbhn'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
          if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<head>\n");
              out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\" />\n");
              out.write("\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <title>Bahan Mamma Masak</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("  \n");
              out.write("      <div id=\"content\">\n");
              out.write("        <!-- insert the page content here -->\n");
              out.write("        <form method=\"POST\" action=\"BahanServlet\">\n");
              out.write("            <h1>Tambah Data Bahan</h1>\n");
              out.write("            <table>\n");
              out.write("                <tr><div>\n");
              out.write("                    <td><label for=\"inputEmail3\">Kode Bahan</label></td>\n");
              out.write("                    <div class=\"col-sm-10\">\n");
              out.write("                        <td>\n");
              out.write("                            ");

                                try {
                                    ResultSet rs = null;
                                    koneksi kon = new koneksi();
                                    rs = kon.stmt.executeQuery("select max(right(kodebahan,4)) as no from bahan");
                                    while (rs.next()) {
                                        if (rs.first() == false) {
                                            out.println("<input type='text' class='form-control' readonly value='BOOO1' name='kodebahan' >");
                                        } else {
                                            rs.last();
                                            int autonokm = rs.getInt(1) + 1;
                                            String nomorkm = String.valueOf(autonokm);
                                            int noLong = nomorkm.length();
                                            for (int a = 1; a < 5 - noLong; a++) {
                                                nomorkm = "0" + nomorkm;
                                            }
                                            String nomerkm = "B" + nomorkm;
                                            out.println("<input type='text' class='form_control' readyonly value='" + nomerkm + "' name='kodebahan'>");
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
              out.write("                    <td>Nama Bahan</td>\n");
              out.write("                    <td><input type=\"text\" name=\"namabahan\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                        <td>Jumlah</td>\n");
              out.write("                    <td><input type=\"text\" name=\"jumlah\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Kode Supplier</td>\n");
              out.write("                    <td><input type=\"text\" name=\"kodesupp\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>ID User</td>\n");
              out.write("                    <td><input type=\"text\" name=\"iduser\"></td>\n");
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
              out.write("                <th>KODE BAHAN</th>\n");
              out.write("                <th>NAMA BAHAN</th>\n");
              out.write("                <th>JUMLAH</th>\n");
              out.write("                <th>KODE SUPPLIER</th>\n");
              out.write("                <th>ID USER</th>\n");
              out.write("                <th>AKSI</th>\n");
              out.write("            </tr>\n");
              out.write("            ");

                String kodebahan = null;
                String namabahan = null;
                String jumlah = null;
                String kodesupp = null;
                String iduser = null;
                ResultSet rs = null;

                koneksi kon = new koneksi();

                rs = kon.stmt.executeQuery("SELECT * FROM bahan ORDER BY kodebahan asc");
                while (rs.next()) {
                    kodebahan = rs.getString("kodebahan");
                    namabahan = rs.getString(2);
                    jumlah = rs.getString(3);
                    kodesupp = rs.getString(4);
                    iduser = rs.getString(5);

            
              out.write("\n");
              out.write("\n");
              out.write("            <tr>\n");
              out.write("                <td>");
 out.println(kodebahan);
              out.write("</td>\n");
              out.write("                <td>");
 out.println(namabahan);
              out.write("</td>\n");
              out.write("                <td>");
 out.println(jumlah);
              out.write("</td>\n");
              out.write("                <td>");
 out.println(kodesupp);
              out.write("</td>\n");
              out.write("                <td>");
 out.println(iduser);
              out.write("</td>\n");
              out.write("                <td><a href=\"beranda.jsp?halaman=editbahan&kodebahan=");
 out.println(kodebahan);
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
              out.write("      </div>\n");
              out.write("</body>\n");
              out.write("</html>");
              out.write("\n");
              out.write("            ");
              int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
          out.write("\n");
          out.write("            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_4.setPageContext(_jspx_page_context);
          _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='menu'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
          if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                ");
              out.write("\n");
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
              out.write("                    <td>\n");
              out.write("                        <select name=\"kodekategori\">\n");
              out.write("                            <option value=\"\">Pilih Kategori</option>\n");
              out.write("                            <option value=\"K0001\">Makanan</option>\n");
              out.write("                            <option value=\"K0002\">Minuman</option>\n");
              out.write("                        </select></td>\n");
              out.write("                    \n");
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

            
              out.write("\n");
              out.write("\n");
              out.write("            <tr>\n");
              out.write("                <td>");
 out.println(kodemenu);
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
              out.write("                <td><a href=\"beranda.jsp?halaman=editmenu&kdmenu=");
 out.println(kodemenu);
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
              out.write("\n");
              out.write("            ");
              int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
          out.write("\n");
          out.write("            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_5.setPageContext(_jspx_page_context);
          _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='editmenu'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
          if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                ");
              out.write("\n");
              out.write("\n");
              out.write("\n");

    String kodemenu = request.getParameter("kdmenu");
    String namamenu = null;
    String kodekategori = null;
    String harga = null;
    String stok = null;
    ResultSet rs = null;
    koneksi kon = new koneksi();
    rs = kon.stmt.executeQuery("select * from menu where kdmenu='" + kodemenu + "'");
    if (rs.next()) {
        kodemenu = rs.getString(1);
        namamenu = rs.getString(2);
        kodekategori = rs.getString(3);
        harga = rs.getString(4);
        stok = rs.getString(5);
    }

              out.write("\n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <title>Ubah Data Mater Menu</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("        <form action=\"ServletMenu\" method=\"POST\">\n");
              out.write("            <table>\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"3\">Ubah Data Menu</td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Kode Menu</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" value=\"");
              out.print(kodemenu);
              out.write("\" readonly>\n");
              out.write("                    <td><input type=\"hidden\" value=\"");
              out.print(kodemenu);
              out.write("\" name=\"kdmenu\">\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Nama Menu</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" name=\"nmmenu\" value=\"");
              out.print(namamenu);
              out.write("\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Kode Kategori</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" name=\"kodekategori\" value=\"");
              out.print(kodekategori);
              out.write("\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Harga</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" name=\"harga\" value=\"");
              out.print(harga);
              out.write("\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Stok</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" name=\"stok\" value=\"");
              out.print(stok);
              out.write("\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"3\">\n");
              out.write("                        <input type=\"submit\" name=\"aksi\" value=\"Update\"> <input type=\"submit\" name=\"aksi\" value=\"Delete\">  <a href=\"beranda.jsp?halaman=menu\">[Lihat Data]</a>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("            </table>            \n");
              out.write("        </form>\n");
              out.write("    </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("            ");
              int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
          out.write("\n");
          out.write("            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_6.setPageContext(_jspx_page_context);
          _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='supplier'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
          if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                ");
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
              out.write("\n");
              out.write("            ");
              int evalDoAfterBody = _jspx_th_c_when_6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
          out.write("\n");
          out.write("            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_7 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_7.setPageContext(_jspx_page_context);
          _jspx_th_c_when_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='editsupp'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_7 = _jspx_th_c_when_7.doStartTag();
          if (_jspx_eval_c_when_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");

    String kodesupp = request.getParameter("kodesupp");
    String namasupp = null;
    String alamat = null;
    String telp = null;
    ResultSet rs = null;
    koneksi kon = new koneksi();
    rs = kon.stmt.executeQuery("select * from supplier where kd_supp='" + kodesupp + "'");
    if (rs.next()) {
        kodesupp = rs.getString(1);
        namasupp = rs.getString(2);
        alamat = rs.getString(3);
        telp = rs.getString(4);
    }

              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <title>Ubah Data Mater Supplier</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("        <form action=\"SuppServlet\" method=\"POST\">\n");
              out.write("            <table>\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"3\">Ubah Data Supplier</td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Kode Supplier</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" value=\"");
              out.print(kodesupp);
              out.write("\" readonly>\n");
              out.write("                    <td><input type=\"hidden\" value=\"");
              out.print(kodesupp);
              out.write("\" name=\"kodesupp\">\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Nama Supplier</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" name=\"namasupp\" value=\"");
              out.print(namasupp);
              out.write("\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Alamat</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" name=\"alamat\" value=\"");
              out.print(alamat);
              out.write("\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Telepon</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" name=\"telp\" value=\"");
              out.print(telp);
              out.write("\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"3\">\n");
              out.write("                        <input type=\"submit\" name=\"aksi\" value=\"Update\"> <input type=\"submit\" name=\"aksi\" value=\"Delete\">  <a href=\"beranda.jsp?halaman=supplier\">[Lihat Data]</a>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("            </table>            \n");
              out.write("        </form>\n");
              out.write("    </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("            ");
              int evalDoAfterBody = _jspx_th_c_when_7.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
          out.write("\n");
          out.write("            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_8 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_8.setPageContext(_jspx_page_context);
          _jspx_th_c_when_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='user'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_8 = _jspx_th_c_when_8.doStartTag();
          if (_jspx_eval_c_when_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\" />\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <title>User Mamma Masak</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("        <div id=\"content\">\n");
              out.write("        <form method=\"POST\" action=\"userServlet\">\n");
              out.write("            <h1>Tambah Data User</h1>\n");
              out.write("            <table>\n");
              out.write("                <tr><div>\n");
              out.write("                    <td><label for=\"inputEmail3\">ID User</label></td>\n");
              out.write("                    <div class=\"col-sm-10\">\n");
              out.write("                        <td>\n");
              out.write("                            ");

                                try {
                                    ResultSet rs = null;
                                    koneksi kon = new koneksi();
                                    rs = kon.stmt.executeQuery("select max(right(id_user,4)) as no from user");
                                    while (rs.next()) {
                                        if (rs.first() == false) {
                                            out.println("<input type='text' class='form-control' readonly value='UOOO1' name='kodeuser' >");
                                        } else {
                                            rs.last();
                                            int autonokm = rs.getInt(1) + 1;
                                            String nomorkm = String.valueOf(autonokm);
                                            int noLong = nomorkm.length();
                                            for (int a = 1; a < 5 - noLong; a++) {
                                                nomorkm = "0" + nomorkm;
                                            }
                                            String nomerkm = "U" + nomorkm;
                                            out.println("<input type='text' class='form_control' readyonly value='" + nomerkm + "' name='kodeuser'>");
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
              out.write("                    <td>Nama User</td>\n");
              out.write("                    <td><input type=\"text\" name=\"namauser\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Hak Akses</td>\n");
              out.write("                    <td><input type=\"text\" name=\"akses\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>\n");
              out.write("                        <input type=\"reset\" value=\"Batal\">\n");
              out.write("                        <input type=\"submit\" value=\"Simpan\" name=\"aksi\">\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("            </table>\n");
              out.write("        </form>\n");
              out.write("        <br>\n");
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
              out.write("                <th>ID USER</th>\n");
              out.write("                <th>NAMA USER</th>\n");
              out.write("                <th>HAK AKSES</th>\n");
              out.write("                <th>AKSI</th>\n");
              out.write("            </tr>\n");
              out.write("            ");

                String kodeuser = null;
                String namauser = null;
                String akses = null;
                ResultSet rs = null;

                koneksi kon = new koneksi();

                rs = kon.stmt.executeQuery("SELECT * FROM user ORDER BY id_user asc");
                while (rs.next()) {
                    kodeuser = rs.getString("id_user");
                    namauser = rs.getString(2);
                    akses = rs.getString(3);
            
              out.write("\n");
              out.write("\n");
              out.write("            <tr>\n");
              out.write("                <td>");
 out.println(kodeuser);
              out.write("</td>\n");
              out.write("                <td>");
 out.println(namauser);
              out.write("</td>\n");
              out.write("                <td>");
 out.println(akses);
              out.write("</td>\n");
              out.write("                <td><a href=\"beranda.jsp?halaman=edituser&kodeuser=");
 out.println(kodeuser);
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
              out.write("        </div>\n");
              out.write("    </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("            ");
              int evalDoAfterBody = _jspx_th_c_when_8.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
          out.write("\n");
          out.write("            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_9 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_9.setPageContext(_jspx_page_context);
          _jspx_th_c_when_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='edituser'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_9 = _jspx_th_c_when_9.doStartTag();
          if (_jspx_eval_c_when_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                ");
              out.write("\n");
              out.write("\n");
              out.write("\n");

    String kodeuser = request.getParameter("kodeuser");
    String namauser = null;
    String akses = null;
    ResultSet rs = null;
    koneksi kon = new koneksi();
    rs = kon.stmt.executeQuery("select * from user where id_user='" + kodeuser + "'");
    if (rs.next()) {
        kodeuser = rs.getString(1);
        namauser = rs.getString(2);
        akses = rs.getString(3);
    }

              out.write("\n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\" />\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <title>Ubah Data Master User</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("        <form action=\"userServlet\" method=\"POST\">\n");
              out.write("            <table>\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"3\">Ubah Data User</td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>ID user</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" value=\"");
              out.print(kodeuser);
              out.write("\" readonly>\n");
              out.write("                    <td><input type=\"hidden\" value=\"");
              out.print(kodeuser);
              out.write("\" name=\"kodeuser\">\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Nama User</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" name=\"namauser\" value=\"");
              out.print(namauser);
              out.write("\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Hak Akses</td>\n");
              out.write("                    <td>:</td>\n");
              out.write("                    <td><input type=\"text\" name=\"akses\" value=\"");
              out.print(akses);
              out.write("\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"3\">\n");
              out.write("                        <input type=\"submit\" name=\"aksi\" value=\"Update\"> <input type=\"submit\" name=\"aksi\" value=\"Delete\">  <a href=\"beranda.jsp?halaman=user\">[Lihat Data]</a>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("            </table>            \n");
              out.write("        </form>\n");
              out.write("    </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("            ");
              int evalDoAfterBody = _jspx_th_c_when_9.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
        return;
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      out.write("\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"content_footer\"></div>\n");
      out.write("    <div id=\"footer\">\n");
      out.write("      <p><a href=\"index.html\">Home</a> | <a href=\"examples.html\">Examples</a> | <a href=\"page.html\">A Page</a> | <a href=\"another_page.html\">Another Page</a> | <a href=\"contact.html\">Contact Us</a></p>\n");
      out.write("      <p>Copyright &copy; simplestyle_blue_trees | <a href=\"http://validator.w3.org/check?uri=referer\">HTML5</a> | <a href=\"http://jigsaw.w3.org/css-validator/check/referer\">CSS</a> | <a href=\"http://www.html5webtemplates.co.uk\">design from HTML5webtemplates.co.uk</a></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='home'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>Restauran Mamma Masak</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <h1>Welcome to the simplestyle_blue_trees template</h1>\n");
        out.write("        <p>This standards compliant, simple, fixed width website template is released as an 'open source' design (under a <a href=\"http://creativecommons.org/licenses/by/3.0\">Creative Commons Attribution 3.0 Licence</a>), which means that you are free to download and use it for anything you want (including modifying and amending it). All I ask is that you leave the 'design from HTML5webtemplates.co.uk' link in the footer of the template, but other than that...</p>\n");
        out.write("        <p>This template is written entirely in <strong>HTML5</strong> and <strong>CSS</strong>, and can be validated using the links in the footer.</p>\n");
        out.write("        <p>You can view more free HTML5 web templates <a href=\"http://www.html5webtemplates.co.uk\">here</a>.</p>\n");
        out.write("        <p>This template is a fully functional 5 page website, with an <a href=\"examples.html\">examples</a> page that gives examples of all the styles available with this design.</p>\n");
        out.write("        <h2>Browser Compatibility</h2>\n");
        out.write("        <p>This template has been tested in the following browsers:</p>\n");
        out.write("        <ul>\n");
        out.write("          <li>Internet Explorer 9</li>\n");
        out.write("          <li>FireFox 25</li>\n");
        out.write("          <li>Google Chrome 31</li>\n");
        out.write("        </ul>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>Restauran Mamma Masak</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <h1>Welcome to the simplestyle_blue_trees template</h1>\n");
        out.write("        <p>This standards compliant, simple, fixed width website template is released as an 'open source' design (under a <a href=\"http://creativecommons.org/licenses/by/3.0\">Creative Commons Attribution 3.0 Licence</a>), which means that you are free to download and use it for anything you want (including modifying and amending it). All I ask is that you leave the 'design from HTML5webtemplates.co.uk' link in the footer of the template, but other than that...</p>\n");
        out.write("        <p>This template is written entirely in <strong>HTML5</strong> and <strong>CSS</strong>, and can be validated using the links in the footer.</p>\n");
        out.write("        <p>You can view more free HTML5 web templates <a href=\"http://www.html5webtemplates.co.uk\">here</a>.</p>\n");
        out.write("        <p>This template is a fully functional 5 page website, with an <a href=\"examples.html\">examples</a> page that gives examples of all the styles available with this design.</p>\n");
        out.write("        <h2>Browser Compatibility</h2>\n");
        out.write("        <p>This template has been tested in the following browsers:</p>\n");
        out.write("        <ul>\n");
        out.write("          <li>Internet Explorer 9</li>\n");
        out.write("          <li>FireFox 25</li>\n");
        out.write("          <li>Google Chrome 31</li>\n");
        out.write("        </ul>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
