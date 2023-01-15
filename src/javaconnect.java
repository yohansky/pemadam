/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.sql.*;
import javax.swing.*;
public class javaconnect {
    
    Connection conn= null;
    public static Connection ConnecrDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver"); //** driver mysql
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/damkar","root",""); //** user dan pass yang harus dibuat dengan privili
            JOptionPane.showMessageDialog(null, "Connection Established");        
        return conn;
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
                return null;
            }
    }
    
}
