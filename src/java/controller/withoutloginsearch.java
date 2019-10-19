/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uni.serives.DB;

/**
 *
 * @author Mohini
 */
public class withoutloginsearch extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int  status=0;
        try (PrintWriter out = response.getWriter()) {
            
            /* TODO output your page here. You may use following sample code. */
             /* TODO output your page here. You may use following sample code. */
            String source=request.getParameter("source");
            String destination=request.getParameter("destination");
          //  out.println("muskan");
           String journeydate = request.getParameter("date");
            
            
           // out.println("sakshi");
           
            Connection con=DB.getConnection();
         PreparedStatement ps=con.prepareStatement("select * from train where source=? and destination=? and DateOfJourney=?");
        ps.setString(1,source);
        ps.setString(2, destination);
        ps.setString(3, journeydate);
        ResultSet a=ps.executeQuery();
        
          
           
           // trainbean bean=new trainbean();
            
           // bean.setSource(source);
           // bean.setDestination(destination);
           // bean.setDateofjourney(journeydate);
          
            // List<trainbean> listtrains=SearchTrainDao.searchtrain(bean);
        
                
            out.println("<center><table border='1'>");
            out.println("<tr width='20px' height='20px'> <th colspan='4'> SHOW TRAINS </th><th colspan=3><a href='view/login.html' background='blue' color='white'>Book Here</a></th></tr>");
            out.println("<tr><th>Train No.</th>"+"<th>Train Name </th>"+"<th>Source</th>"+"<th>Destination</th>"+"<th>Arrival Time</th>"+"<th>Departure Time</th>"+"<th>Date Of Journey</th>"+"</tr>");
            if(a.next()) {
                out.println("<tr>");
                out.println("<td>"+a.getInt(1)+"</td>");
                out.println("<td>"+a.getString(2)+"</td>");
                out.println("<td>"+a.getString(3)+"</td>");
                out.println("<td>"+a.getString(4)+"</td>");
                out.println("<td>"+a.getString(5)+"</td>");
                out.println("<td>"+a.getString(6)+"</td>");
                out.println("<td>"+a.getString(7)+"</td>");
                out.println("</tr>");
            }
            
             else{
               out.println("<script>");
               out.println("alert('Train Not Found !!! ')");
               out.println("window.location='index.html'");
                     out.println("</script>");
            }
            
            out.println("</table>");
            out.println("</center>");
            
            
            
          
               
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
