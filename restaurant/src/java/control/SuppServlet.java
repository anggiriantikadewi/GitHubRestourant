/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.supplier;
/**
 *
 * @author Anggi Riantika Dewi
 */
public class SuppServlet extends HttpServlet {

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
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            supplier supp=new supplier();
            koneksi kon = new koneksi();
            PreparedStatement pstmt=null;
            int result=0;
            
            String aksi = request.getParameter("aksi");
            if(aksi !=null){
                supp.setKodesupp(request.getParameter("kodesupp"));
                supp.setNamasupp(request.getParameter("namasupp"));
                supp.setAlamat(request.getParameter("alamat"));
                supp.setTelepon(Double.parseDouble(request.getParameter("telp")));
                switch(aksi){
                    case "Simpan":
                        pstmt=kon.conn.prepareStatement("INSERT INTO supplier values('"+supp.getKodesupp()+"','"
                                + supp.getNamasupp()+"','"
                                + supp.getAlamat()+"','"
                                + supp.getTelepon()+"')");
                        
                        result=pstmt.executeUpdate();
                        if(result>0){
                            out.println("<script>"
                            + "alert('Data Telah Ditambahkan');"
                            + "document.location='beranda.jsp?halaman=supplier';"
                            + "</script>");
                        }
                        break;
                    case "Delete":
                        pstmt=kon.conn.prepareStatement("DELETE FROM supplier WHERE kd_supp='"+supp.getKodesupp()+"'");
                        result=pstmt.executeUpdate();
                        if(result>0){
                            out.println("<script>"
                            + "alert('Data Telah Dihapus');"
                            + "document.location='beranda.jsp?halaman=supplier';"
                            + "</script>");
                        }
                        break;
                    case "Update":
                        pstmt=kon.conn.prepareStatement("UPDATE supplier SET nm_supp='"
                        + supp.getNamasupp()+"',alamat='"
                        + supp.getAlamat()+"',telpon='"
                        + supp.getTelepon()+"' where kd_supp='"
                        + supp.getKodesupp()+"'");
                        
                        result=pstmt.executeUpdate();
                        if(result>0){
                            out.println("<script>"
                            + "alert('Data Telah Diubah');"
                            + "document.location='beranda.jsp?halaman=supplier';"
                            + "</script>");
                        }
                    default:
                        break;
                }
            }
            else{
                out.println("<script>"
                            + "alert('Gagal Eksekusi');"
                            + "document.location='supplier.jsp';"
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
        } catch (SQLException ex) {
            Logger.getLogger(SuppServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SuppServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (SQLException ex) {
            Logger.getLogger(SuppServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SuppServlet.class.getName()).log(Level.SEVERE, null, ex);
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
