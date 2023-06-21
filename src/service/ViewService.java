/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;
public class ViewService {
    public static Connection cn = null;
    public static Statement st = null;
    public static ResultSet rs = null;
    public static ResultSet viewStudent(){
        try {
            cn = connection.ConnectionDB.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery("select * from addstudentpage");
        }catch(SQLException se) {
            se.printStackTrace();
        }
        finally {
            return rs;
        }
    }
    
}
