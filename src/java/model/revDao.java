/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import com.mysql.jdbc.Connection;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import uni.serives.DB;


/**
 *
 * @author Mohini
 */
public class revDao {
   
    public static boolean save(regbean e){
        
    try{
        Connection con=DB.getConnection();
        PreparedStatement  ps=con.prepareStatement("select (username,password )from registration where name=? and password=? ");
        ps.setString(1,e.getUsername());
        ps.setString(2,e.getPassword()); 
        ResultSet rs=ps.executeQuery();
         regbean b=new regbean();
         //b.setId(rs.getInt(1));
         b.setUsername(rs.getString(2));
          b.setPassword(rs.getString(3));
         
         con.close();
        }
        catch(Exception ex){
        ex.printStackTrace();
        }
        return false;
    }
  
}
