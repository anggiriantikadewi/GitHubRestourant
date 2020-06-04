/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Anggi Riantika Dewi
 */
public class koneksi {
    Connection conn = null;
    public Statement stmt = null;
    ResultSet rs;
    
    public static void ambilKoneksi() {
        try {
            String db = "jdbc:mysql://localhost:3306/restaurant";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(db, user, pass);
        } catch (Exception x) {
            System.out.println("Terjadi kesalahan ambil koneksi :" + x );
        }
    }
    
    public koneksi() throws ClassNotFoundException {
        String dbName = "restaurant";
        String uName = "root";
        String pass = "";
        String URL = "jdbc:mysql://localhost/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        try {
            conn = DriverManager.getConnection(URL, uName, pass);
            stmt = conn.createStatement();
        } catch (Exception ex) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public koneksi(String dbName, String uName, String pass) throws ClassNotFoundException {
        String URL = "jdbc:mysql://localhost/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        try {
            conn = DriverManager.getConnection(URL, uName, pass);
            stmt = conn.createStatement();
        } catch (Exception ex) {
            Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void bukakoneksi(){
        try {
            String db = "jdbc:mysql://localhost:3306/restaurant";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(db, user, pass);
            stmt = conn.createStatement();
        } catch (Exception x) {
            System.out.println("Terjadi kesalahan koneksi : " + x);
        }
    }
    
    public void diskonek(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            stmt.close();
            conn.close();
        } catch (Exception x) {
            System.out.println("Terjadi kesalahan diskoneksi : " + x);
        }
    }
    
    public ResultSet ambilData (String sql) {
        ResultSet rs = null;
        try {
            bukakoneksi();
            rs = stmt.executeQuery(sql);
            
        } catch (Exception x) {
            System.out.println("Terjadi kesalahan ambil data : " + x);
        }
        return rs;
    }
    
    public void close() throws SQLException {
        conn.close();
        stmt.close();
    }
}
