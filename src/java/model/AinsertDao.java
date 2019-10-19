/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import uni.serives.DB;

/**
 *
 * @author Mohini
 */
public class AinsertDao {
    public static int insert(trainbean b){
        int status=0;
        try{
        Connection con=DB.getConnection();
        PreparedStatement ps=con.prepareStatement("insert into train (trainno,trainname,source,destination,arrivaltime,departuretime,DateOfJourney) values(?,?,?,?,?,?,?)");
        ps.setInt(1,b.getTrainno());
        ps.setString(2,b.getTrainname());
        ps.setString(3,b.getSource());
        ps.setString(4,b.getDestination());
        ps.setString(5,b.getArrivaltime());
        ps.setString(6,b.getDeparturetime());
        ps.setString(7,b.getDateofjourney());
       status=ps.executeUpdate();
       con.close();
 
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
       return status;
    }
    
}
