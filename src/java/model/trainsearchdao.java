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
public class trainsearchdao {
    public static List<ticketbean> search(){
          List<ticketbean> list=new ArrayList<ticketbean>();  
    try{
    Connection con=DB.getConnection();
    System.out.println("sakshi");
    PreparedStatement ps=con.prepareStatement("select * from train where source=? and destination=? and DateOfJourney=? ");
    ResultSet rs=ps.executeQuery();
   while(rs.next()){
       trainbean bean=new trainbean();
       bean.setSource(rs.getString(1));
       bean.setDestination(rs.getString(2));
       bean.setDateofjourney(rs.getString(3));
   }
    con.close();
    }
    catch(Exception ex){}
        return list;
    }

    
    
}
