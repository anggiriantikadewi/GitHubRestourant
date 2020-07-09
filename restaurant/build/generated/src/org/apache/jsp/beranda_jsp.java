package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.koneksi;
import java.sql.ResultSet;
import model.supplier;
import model.pembelian;
import control.koneksi;
import java.sql.ResultSet;
import model.menu;
import model.supplier;
import model.pembelian;
import control.koneksi;
import java.sql.ResultSet;
import model.menu;
import model.penjualan;
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


                int subqty = 0, sub = 0;
            
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(13);
    _jspx_dependants.add("/home.jsp");
    _jspx_dependants.add("/bahan.jsp");
    _jspx_dependants.add("/pembelian.jsp");
    _jspx_dependants.add("/penjualan.jsp");
    _jspx_dependants.add("/editbahan.jsp");
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/editmenu.jsp");
    _jspx_dependants.add("/supplier.jsp");
    _jspx_dependants.add("/editsupplier.jsp");
    _jspx_dependants.add("/user.jsp");
    _jspx_dependants.add("/edituser.jsp");
    _jspx_dependants.add("/CetakLaporanBahan.jsp");
    _jspx_dependants.add("/CetakLapMenu.jsp");
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
      out.write("          <h2>Makanan Minuman Enakkkkk!</h2>\n");
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
      out.write("          <li><a href=\"beranda.jsp?halaman=pembelian\">Pembelian</a></li>\n");
      out.write("          <li><a href=\"beranda.jsp?halaman=penjualan\">Penjualan</a></li>\n");
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
      out.write("            <h4>RESTAURANT MAMMA MASAK</h4>\n");
      out.write("            <h5>February 1st, 2010</h5>\n");
      out.write("            <p>Mamma Masak adalah perusahaan yang bergerak dibidang penjualan makanan dan minuman. Berdiri sejak tahun 2010 dan didirikan oleh Ibu Marwah Rianti dengan memiliki 6 karyawan dengan bagian masing masing. .<br /><a href=\"#\">Read more</a></p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"sidebar_base\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("          <div class=\"sidebar_top\"></div>\n");
      out.write("          <div class=\"sidebar_item\">\n");
      out.write("            <h3>Useful Links</h3>\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"beranda.jsp?halaman=lapbahan\">Laporan Bahan</a></li>\n");
      out.write("              <li><a href=\"beranda.jsp?halaman=lapmenu\">Laporan Menu</a></li>\n");
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
          _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='pembelian'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
          if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");

    pembelian pemesanan=new pembelian();
    menu menu=new menu();
    supplier supplier=new supplier();
    koneksi kon= new koneksi();
    ResultSet rs=null;
    ResultSet qrymenu=null;
    ResultSet qrypembelian=null;

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
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <title>Pembelian Mamma Masak</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");
              out.write("        <form method=\"POST\" action=\"ServletPembelian\">\n");
              out.write("            <h1>Tambah Data Pembelian</h1>\n");
              out.write("            <table>\n");
              out.write("                <tr><div>\n");
              out.write("                    <td><label for=\"inputEmail3\">No Pembelian</label></td>\n");
              out.write("                    <div class=\"col-sm-10\">\n");
              out.write("                        <td>\n");
              out.write("                            ");

                                try {
                                    
                                    rs = kon.stmt.executeQuery("select max(right(no_beli,4)) as no from pembelian");
                                    while (rs.next()) {
                                        if (rs.first() == false) {
                                            out.println("<input type='text' class='form-control' readonly value='POOO1' name='no_beli' >");
                                        } else {
                                            rs.last();
                                            int autonokm = rs.getInt(1) + 1;
                                            String nomorkm = String.valueOf(autonokm);
                                            int noLong = nomorkm.length();
                                            for (int a = 1; a < 5 - noLong; a++) {
                                                nomorkm = "0" + nomorkm;
                                            }
                                            String nomerkm = "P" + nomorkm;
                                            out.println("<input type='text' class='form_control' readyonly value='" + nomerkm + "' name='no_beli'>");
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
              out.write("                    <td>Tanggal Pembelian</td>\n");
              out.write("                    <td><input type=\"text\" name=\"tgl_beli\" value=\"");
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
              out.write("                        \n");
              out.write("                        \n");
              out.write("                </tr>\n");
              out.write("                \n");
              out.write("                <tr>\n");
              out.write("                \n");
              out.write("                    <td>Harga</td>\n");
              out.write("                    <td><input type=\"text\" readonly name=\"emp_name\" id=\"ename\" value=\"\" onkeyup=\"sum();\"</td>\n");
              out.write("                    \n");
              out.write("                </tr>\n");
              out.write("                \n");
              out.write("                <tr>\n");
              out.write("                    <td>QTY</td>\n");
              out.write("                    <td><input type=\"text\" name=\"qty_beli\" id=\"jml\" onkeyup=\"sum();\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Subtotal</td>\n");
              out.write("                    <td><input type=\"text\" name=\"sub_beli\" id=\"subtotal\" readonly=\"readonly\"></td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>Kode Supplier</td>\n");
              out.write("                    <td><select name=\"kd_supp\">\n");
              out.write("                                    <option value=\"-1\">Pilih Supplier</option>\n");
              out.write("                                    ");

                                        rs=kon.stmt.executeQuery("select * from supplier");
                                        while(rs.next()){
                                            supplier.setKodesupp(rs.getString("kd_supp"));
                                            supplier.setNamasupp(rs.getString("nm_supp"));
                                        
                                    
              out.write("\n");
              out.write("                                    <option value=\"");
              out.print(supplier.getKodesupp());
              out.write('"');
              out.write('>');
              out.print(supplier.getKodesupp());
              out.write(" || ");
              out.print(supplier.getNamasupp());
              out.write("</option>\n");
              out.write("                                    ");
 } 
              out.write("\n");
              out.write("                        </select></td>\n");
              out.write("                        \n");
              out.write("                </tr>\n");
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
              out.write("       \n");
              out.write("        \n");
              out.write("        <form method=\"POST\" action=\"ServletPembelians\">\n");
              out.write("        <table border=\"1\">\n");
              out.write("            <tr align=\"center\">\n");
              out.write("                <th>NO PEMBELIAN</th>\n");
              out.write("                <th>KODE MENU</th>\n");
              out.write("                <th>QUANTITY</th>\n");
              out.write("                <th>SUBTOTAL</th>\n");
              out.write("            </tr>\n");
              out.write("            ");

                String nobeli = null;
                String kodemenu = null;
                String qty = null;
                String subtotal = null;
                
                rs = kon.stmt.executeQuery("SELECT * FROM sementara ORDER BY no_beli asc");
                while (rs.next()) {
                    nobeli = rs.getString("no_beli");
                    kodemenu = rs.getString(2);
                    qty = rs.getString(3);
                    subtotal = rs.getString(4);

            
              out.write("\n");
              out.write("\n");
              out.write("            <tr>\n");
              out.write("                <td>");
 out.println(nobeli);
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
              out.write("        \n");
              out.write("            ");
              out.write("\n");
              out.write("            ");

                rs = kon.stmt.executeQuery("SELECT * from sementara");
                while (rs.next()) {
                    
                    subqty = subqty + (Integer.parseInt(rs.getString(3)));
                    sub = sub + (Integer.parseInt(rs.getString(4)));
                    }
            
              out.write("\n");
              out.write("            <tr>\n");
              out.write("                <td colspan=\"2\"><b align=\"center\">TOTAL</b></td>\n");
              out.write("                <td><b>");
 out.println(subqty);
              out.write("</b></td>\n");
              out.write("                <td><b>");
 out.println(sub);
              out.write("</b></td>\n");
              out.write("            </tr>\n");
              out.write("            </table>\n");
              out.write("           ");
 kon.close();
              out.write("\n");
              out.write("           <input type=\"submit\" value=\"Proses\" name=\"aksi\">\n");
              out.write("        </form>\n");
              out.write("    </body>\n");
              out.write("</html>");
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
          _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='penjualan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
          if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                ");
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
              out.write("       <br>\n");
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
              out.write("            ");

                int subs = 0, sub = 0;
            
              out.write("\n");
              out.write("            ");

                rs = kon.stmt.executeQuery("SELECT * from sementara_jual");
                while (rs.next()) {
                    
                    subs = subs + (Integer.parseInt(rs.getString(3)));
                    sub = sub + (Integer.parseInt(rs.getString(4)));
                    }
            
              out.write("\n");
              out.write("            <tr>\n");
              out.write("                <td colspan=\"2\"><b align=\"center\">TOTAL</b></td>\n");
              out.write("                <td><b>");
 out.println(subs);
              out.write("</b></td>\n");
              out.write("                <td><b>");
 out.println(sub);
              out.write("</b></td>\n");
              out.write("            </tr>\n");
              out.write("            </table>\n");
              out.write("           ");
 kon.close();
              out.write("\n");
              out.write("    </body>\n");
              out.write("</html>\n");
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
          _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='editbahan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
          if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
          _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='tampilbhn'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
          if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
          _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='menu'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
          if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
              out.write("                <th>HARGA</th>                \n");
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
          _jspx_th_c_when_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='editmenu'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_7 = _jspx_th_c_when_7.doStartTag();
          if (_jspx_eval_c_when_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
          _jspx_th_c_when_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='supplier'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
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
          _jspx_th_c_when_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='editsupp'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_9 = _jspx_th_c_when_9.doStartTag();
          if (_jspx_eval_c_when_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_10 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_10.setPageContext(_jspx_page_context);
          _jspx_th_c_when_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='user'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_10 = _jspx_th_c_when_10.doStartTag();
          if (_jspx_eval_c_when_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
              int evalDoAfterBody = _jspx_th_c_when_10.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
          out.write("\n");
          out.write("            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_11 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_11.setPageContext(_jspx_page_context);
          _jspx_th_c_when_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='edituser'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_11 = _jspx_th_c_when_11.doStartTag();
          if (_jspx_eval_c_when_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
              int evalDoAfterBody = _jspx_th_c_when_11.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_c_when_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_c_when_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
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
        out.write("        <h1>SELAMAT DATANG DI RESTAURAN MAMMA MASAK</h1>\n");
        out.write("        <p> Disini anda bisa makan dan minum karena ini adalah restoran</p>\n");
        out.write("        <p> disinipun kami menyediakan makanan ringan dan makanan berat, kami pula menyediakan minuman hangat dan segar</p>\n");
        out.write("        <p> Tetapi kami tidak menyediakan jodoh untuk anda</p>\n");
        out.write("        <h2>PILIHAN MAMA MASAK</h2>\n");
        out.write("        <p> Silahkan dibaca </p>\n");
        out.write("        <ul>\n");
        out.write("          <li>Home Adalah tampilan utama</li>\n");
        out.write("          <li> Menu Adalah tampilan menu makanan atau minuman yang akan dipilih</li>\n");
        out.write("          <li> Bahan Adalah bahan baku makanan dan minuman yang akan dimasak</li>\n");
        out.write("          <li> Supplier Adalah tampilan personal perusahaan untuk pembelian bahan baku</li>\n");
        out.write("          <li> User Adalah kontak admin yang akan menginput </li>\n");
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

  private boolean _jspx_meth_c_when_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_12 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_12.setPageContext(_jspx_page_context);
    _jspx_th_c_when_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='lapbahan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_12 = _jspx_th_c_when_12.doStartTag();
    if (_jspx_eval_c_when_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<!DOCTYPE html>\r\n");
        out.write("<html>\r\n");
        out.write("    <head>\r\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
        out.write("        <title>JSP Page</title>\r\n");
        out.write("    </head>\r\n");
        out.write("    <body>\r\n");
        out.write("        <h3>Cetak Laporan Barang Berdasarkan Stok Tersedia</h3>\r\n");
        out.write("        <form action=\"TampilLaporanBahan.jsp\" method=\"get\">\r\n");
        out.write("            Stok <= <input type=\"number\" name=\"jumlah\" value=\"0\">\r\n");
        out.write("            <input type=\"submit\" name=\"submit\" value=\"Cetak Laporan\"/>\r\n");
        out.write("        </form>\r\n");
        out.write("    </body>\r\n");
        out.write("</html>\r\n");
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_12);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_12);
    return false;
  }

  private boolean _jspx_meth_c_when_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_13 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_13.setPageContext(_jspx_page_context);
    _jspx_th_c_when_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='lapmenu'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_13 = _jspx_th_c_when_13.doStartTag();
    if (_jspx_eval_c_when_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
        out.write("        <title>Cetak Laporan Menu</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <h3>Cetak Laporan Menu Berdasarkan Jumlah Tersedia</h3>\n");
        out.write("        <form action=\"TampilLapMenu.jsp\" method=\"get\">\n");
        out.write("            Jumlah <= <input type=\"number\" name=\"jumlah\" value=\"0\">\n");
        out.write("            <input type=\"submit\" name=\"submit\" value=\"Cetak Laporan\"/>\n");
        out.write("        </form>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_13);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_13);
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
        out.write("        <h1>SELAMAT DATANG DI RESTAURAN MAMMA MASAK</h1>\n");
        out.write("        <p> Disini anda bisa makan dan minum karena ini adalah restoran</p>\n");
        out.write("        <p> disinipun kami menyediakan makanan ringan dan makanan berat, kami pula menyediakan minuman hangat dan segar</p>\n");
        out.write("        <p> Tetapi kami tidak menyediakan jodoh untuk anda</p>\n");
        out.write("        <h2>PILIHAN MAMA MASAK</h2>\n");
        out.write("        <p> Silahkan dibaca </p>\n");
        out.write("        <ul>\n");
        out.write("          <li>Home Adalah tampilan utama</li>\n");
        out.write("          <li> Menu Adalah tampilan menu makanan atau minuman yang akan dipilih</li>\n");
        out.write("          <li> Bahan Adalah bahan baku makanan dan minuman yang akan dimasak</li>\n");
        out.write("          <li> Supplier Adalah tampilan personal perusahaan untuk pembelian bahan baku</li>\n");
        out.write("          <li> User Adalah kontak admin yang akan menginput </li>\n");
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
