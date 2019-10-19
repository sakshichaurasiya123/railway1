/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import uni.serives.DB;

/**
 *
 * @author Mohini
 */
public class reserveDao {
    public static int reservation (reservebean e){
    int status=0;
    try{
    Connection con=DB.getConnection();
    out.println("welcome");
    PreparedStatement ps=con.prepareStatement("insert into reservation (name,age,gender,travellingClass,PNR) values(?,?,?,?,?)");
    ps.setString(1,e.getName());
    ps.setInt(2,e.getAge());
    ps.setString(3,e.getGender());
    //ps.setInt(4,e.getBookingDate());
    ps.setString(4, e.getTravellingClass());
    ps.setInt(5,e.getPNR());
    status=ps.executeUpdate();
    con.close();
    }
    catch(Exception ex){
    ex.printStackTrace();
    }
        return status;
    }
}
