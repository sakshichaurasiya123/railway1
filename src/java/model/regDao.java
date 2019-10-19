/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import uni.serives.DB;
/**
 *
 * @author Mohini
 */
public class regDao {
     
   public static int insert(regbean e){
    int status=0;
    try{
        Connection con=DB.getConnection();
        PreparedStatement  ps=con.prepareStatement("insert into registration(username,email,password,cpassword) values(?,?,?,?)");
  
        ps.setString(1,e.getUsername()); 
      //  ps.setInt(2,e.getMno());
        ps.setString(2,e.getEmail());
        ps.setString(3,e.getPassword());
        ps.setString(4,e.getCpassword());
         
        status=ps.executeUpdate();
        con.close();
    }
    catch(Exception ex){
        ex.printStackTrace();
    }
        return status;
    
    }
}