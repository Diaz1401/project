/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectakhir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class KoneksiKashoes {

   
    Connection con;
    Statement st;
    public static Connection koneksikashoesdB(){
     try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/kashoes","root","arrosyid028");
            
            return koneksi;
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null; 
        }
    }
    private void config(){
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/kashoes","root","arrosyid028");
            st = con.createStatement();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi gagal"+e.getMessage());
        }
    }
}
