/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.menu;

/**
 *
 * @author Anggi Riantika Dewi
 */
public class ServletMenu extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            menu men=new menu();
            koneksi kon = new koneksi();
            PreparedStatement pstmt=null;
            int result=0;
            
            String aksi = request.getParameter("aksi");
            if(aksi !=null){
                men.setKodemenu(request.getParameter("kdmenu"));
                men.setNamamenu(request.getParameter("nmmenu"));
                men.setKodekategori(request.getParameter("kodekategori"));
                men.setHarga(request.getParameter("harga"));
                men.setStok(request.getParameter("stok"));
                switch(aksi){
                    case "Simpan":
                        pstmt=kon.conn.prepareStatement("INSERT INTO menu values('"+men.getKodemenu()+"','"
                                + men.getNamamenu()+"','"
                                + men.getKodekategori()+"','"
                                + men.getHarga()+"','"
                                + men.getStok()+"')");
                        
                        result=pstmt.executeUpdate();
                        if(result>0){
                            out.println("<script>"
                            + "alert('Data Telah Ditambahkan');"
                            + "document.location='beranda.jsp?halaman=menu';"
                            + "</script>");
                        }
                        break;
                    case "Delete":
                        pstmt=kon.conn.prepareStatement("DELETE FROM menu WHERE kdmenu='"+men.getKodemenu()+"'");
                        result=pstmt.executeUpdate();
                        if(result>0){
                            out.println("<script>"
                            + "alert('Data Telah Dihapus');"
                            + "document.location='beranda.jsp?halaman=menu';"
                            + "</script>");
                        }
                        break;
                    case "Update":
                        pstmt=kon.conn.prepareStatement("UPDATE menu SET nmmenu='"
                        + men.getNamamenu()+"',kodekategori='"
                        + men.getKodekategori()+"',harga='"
                        + men.getHarga()+"',stok='"
                        + men.getStok()+"' where kdmenu='"
                        + men.getKodemenu()+"'");
                        
                        result=pstmt.executeUpdate();
                        if(result>0){
                            out.println("<script>"
                            + "alert('Data Telah Diubah');"
                            + "document.location='beranda.jsp?halaman=menu';"
                            + "</script>");
                        }
                    default:
                        break;
                }
            }
            else{
                out.println("<script>"
                            + "alert('Gagal Eksekusi');"
                            + "document.location='beranda.jsp';"
                            + "</script>");
            }            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
