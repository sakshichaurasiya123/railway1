/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import uni.serives.DB;

/**
 *
 * @author Mohini
 */
public class canceldao {
    public static int cancel(reservebean e){
         int status=0;
        try{
           
            Connection con=DB.getConnection();
            PreparedStatement ps=con.prepareStatement("delete  from reservation where PNR=? ");
            ps.setInt(1,e.getPNR());
          status=ps.executeUpdate();
        }
           catch(Exception ex){
                    ex.printStackTrace();
            }
      return status;
            
        
        
    }
    
}
