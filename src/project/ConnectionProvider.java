/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        Connection con = null;
      try
      {
        Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms","root","");
//         JOptionPane.showConfirmDialog(null, "successful connection");
       
      } 
      catch(Exception e)
              {
                JOptionPane.showConfirmDialog(null, e);
              }
       return con;
    }
}
