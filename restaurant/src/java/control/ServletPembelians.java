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
import model.pembelian;

/**
 *
 * @author Anggi Riantika Dewi
 */
public class ServletPembelians extends HttpServlet {

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
            pembelian men=new pembelian();
            koneksi kon = new koneksi();
            PreparedStatement pstmt=null;
            PreparedStatement pstmt1=null;
            PreparedStatement pstmt2=null;
            int result=0;
            int result1=0;
            int result2=0;
            
            String aksi1 = request.getParameter("aksi1");
            if(aksi1 !=null){
                men.setNobeli(request.getParameter("no_beli"));
                men.setTanggalbeli(request.getParameter("tgl_beli"));
                men.setKodemenu(request.getParameter("semp_id"));
                men.setHarga(request.getParameter("emp_name"));
                men.setQty(request.getParameter("qty_beli"));
                men.setSubtotal(request.getParameter("sub_beli"));
                switch(aksi1){
                    case "Proses":
                        pstmt=kon.conn.prepareStatement("INSERT INTO detail_pembelian values('"+men.getNobeli()+"','"
                                + men.getKodemenu()+"','"
                                + men.getHarga()+"','"
                                + men.getQty()+"','"
                                + men.getSubtotal()+"')");
                        result=pstmt.executeUpdate();
                        
                
                        if(result>0){
                            out.println("<script>"
                            + "alert('Data Telah Ditambahkan');"
                            + "document.location='beranda.jsp?halaman=pembelian';"
                            + "</script>");
                        }
                        break;
                    case "Delete":
                        pstmt=kon.conn.prepareStatement("DELETE FROM sementara WHERE nomer='"+men.getNobeli()+"'");
                        result=pstmt.executeUpdate();
                        if(result>0){
                            out.println("<script>"
                            + "alert('Data Telah Dihapus');"
                            + "document.location='beranda.jsp?halaman=pembelian';"
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
        } catch (SQLException ex) {
            Logger.getLogger(ServletPembelians.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletPembelians.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ServletPembelians.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletPembelians.class.getName()).log(Level.SEVERE, null, ex);
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
