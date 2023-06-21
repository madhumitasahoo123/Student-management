        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;
public class signUpservice {
    
   public static  Connection cn = null;
   public static  Statement st = null;
   public static boolean insertUser(String student_name, String student_phno,String student_password,String student_Address){
       try{
           cn = connection.ConnectionDB.getConnection();
           st = cn.createStatement();
           st.executeUpdate("insert into sign values('"+student_name+"','"+student_phno+"','"+student_password+"','"+student_Address+"')");
           return true;
        
     }catch( SQLException se){
         se.printStackTrace();
     }

      return false;
   }
}
