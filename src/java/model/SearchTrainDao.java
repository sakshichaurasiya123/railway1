/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import uni.serives.DB;

/**
 *
 * @author Mohini
 */
 public class SearchTrainDao {
    
  public static List<trainbean> searchtrain(trainbean e){
        List<trainbean> listtrains=new ArrayList<>();
        int status=0;
        try{
        Connection con=DB.getConnection();
         PreparedStatement ps=con.prepareStatement("select * from train where source=? and destination=? and DateOfJourney=?");
        ps.setString(1,e.getSource());
        ps.setString(2, e.getDestination());
        ps.setString(3, e.getDateofjourney());
        ResultSet rs=ps.executeQuery();
        
        while(rs.next()){
          trainbean t=new trainbean();
          t.setTrainno(rs.getInt(1));
          t.setTrainname(rs.getString(2));
          t.setSource(rs.getString(3));
          t.setDestination(rs.getString(4));
        // t.setArrivaltime(rs.getString(5));
          //t.setDeparturetime(rs.getString(5));
          //t.setDateofjourney(rs.getString(6));
        
		 
          listtrains.add(t);
        }
          
                
        
        
    }
        catch(Exception ex){
        ex.printStackTrace();
        }
        return listtrains;
    }
    
    
}
