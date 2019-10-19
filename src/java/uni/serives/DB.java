/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.serives;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Mohini
 */
public class DB {
     public static Connection  getConnection(){
    Connection con=null;
   try {
       Class.forName("com.mysql.jdbc.Driver");
       con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","");  

    }
catch(Exception e){
    System.out.println(e);
    }
   return con;
   }    
}
