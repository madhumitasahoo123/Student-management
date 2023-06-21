/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;
public class forgotpasswordservice {
    public static Connection cn = null;
    public static Statement st = null;
    public static boolean forgotstudent( String name, String  password ) {
        try {
           cn = connection.ConnectionDB.getConnection();
           st = cn.createStatement();
           st.executeUpdate("UPDATE user SET password = '"+password+"', WHERE name = '"+name+"'");
           return true;
        }catch(SQLException se){
            se.printStackTrace();
        }
    return false;
    }
    
    
}
