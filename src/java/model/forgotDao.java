/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import uni.serives.DB;

/**
 *
 * @author Mohini
 */
public class forgotDao {
    
    
    public static int update(regbean e){  
        int status=0;  
        try{  
            Connection con=DB.getConnection();  
            PreparedStatement ps=con.prepareStatement("update registration set password=? , cpassword=? where email=?"); 
            
           ps.setString(1,e.getPassword());
            ps.setString(2,e.getCpassword());
             ps.setString(3,e.getEmail());
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){        }  
          
        return status;  
    }  
    
}
