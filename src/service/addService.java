/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Pavilion
 */
public class addService {
    
    public static Connection cn =  null;
    public static Statement st  = null;
    
    public static boolean addstudentpage(String Name, String College, String Passout_year,String Course, String Branch){
      
         try{
             cn = connection .ConnectionDB.getConnection();
             st = cn.createStatement();
    st.executeUpdate("insert into addStudentpage values('"+Name+"','"+College+"','"+Passout_year+"','"+Course+"','"+Branch+"')");
             return true;
         }catch(SQLException se){
             se.printStackTrace();
         }
           return false;
    
    }
}
