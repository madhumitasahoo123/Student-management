/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;

/**
 *
 * @author Pavilion
 */
public class deleteservice {
    public static Connection cn = null;
    public static Statement st = null;
    public static boolean deleteid(String Name) {
    try{
        cn = connection.ConnectionDB.getConnection();
        st = cn.createStatement ();
        st.executeUpdate("delete from addstudentpage WHERE Name = '"+Name+"'");
        return true;
    }
    catch(SQLException se)
    {
        se.printStackTrace();
    }
    return false;
    
    }
}
    

