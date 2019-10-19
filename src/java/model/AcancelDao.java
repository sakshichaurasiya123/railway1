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
public class AcancelDao {
    public static int cancelTrain( trainbean e){
    int status=0;
    try{
    Connection con=DB.getConnection();
    PreparedStatement  ps=con.prepareStatement("delete from train where trainno=?");
    ps.setInt(1, e.getTrainno());
    status=ps.executeUpdate();
      
 
    }
    
     catch(Exception ex){
ex.printStackTrace();
}
    
    return status;
    
    
    }
   
 
    
}
