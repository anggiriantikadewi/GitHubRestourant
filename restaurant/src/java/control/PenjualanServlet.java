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
import model.penjualan;

/**
 *
 * @author Anggi Riantika Dewi
 */
public class PenjualanServlet extends HttpServlet {

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
            penjualan pj=new penjualan();
            koneksi kon = new koneksi();
            PreparedStatement pstmt=null;
            int result=0;
            String aksi = request.getParameter("aksi");
            if(aksi !=null){
                pj.setNojual(request.getParameter("no_jual"));
                pj.setTanggaljual(request.getParameter("tgl_jual"));
                pj.setKodemenu(request.getParameter("semp_id"));
                pj.setHarga(request.getParameter("ename"));
                pj.setQtyjual(request.getParameter("qty_jual"));
                pj.setSubtotal(request.getParameter("sub_jual"));
                switch(aksi){
                    case "Simpan":
                        pstmt=kon.conn.prepareStatement("INSERT INTO sementara_jual values('"+pj.getNojual()+"','"
                                + pj.getKodemenu()+"','"
                                + pj.getQtyjual()+"','"
                                + pj.getSubtotal()+"')");
                       
                        result=pstmt.executeUpdate();
                        
                
                        if(result>0){
                            out.println("<script>"
                            + "alert('Data Telah Ditambahkan');"
                            + "document.location='beranda.jsp?halaman=penjualan';"
                            + "</script>");
                        }
                        break;
                    
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
            Logger.getLogger(PenjualanServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(PenjualanServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanServlet.class.getName()).log(Level.SEVERE, null, ex);
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
