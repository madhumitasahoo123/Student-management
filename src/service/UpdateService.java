/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;
public class UpdateService {
    public static Connection cn = null;
    public static  Statement st = null;
    public static boolean updateStudent(String name  , String college , String passoutyear ,String course , String Branch ){
        try{
            cn = connection.ConnectionDB.getConnection();
            st = cn.createStatement();
            st.executeUpdate("Update addstudentpage SET college = '" +college +"',passout_year = '" + passoutyear +"', course ='" + course +"', Branch = '" +Branch +"' WHERE  name = '"+name+"'");
            return true;
        }catch(SQLException se){
            se.printStackTrace();
        }
    return false;
   }
}