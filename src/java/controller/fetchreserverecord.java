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
public class fetchreserverecord extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Connection con=DB.getConnection();
            // out.println("sakshi");
      
            PreparedStatement ps=con.prepareStatement("select * from reservation  ");
            ResultSet rs=ps.executeQuery();
            
                    /* HttpSession session=request.getSession(false);
                      String name1=(String)session.getAttribute("name");  
                      Integer age1=(Integer)session.getAttribute("age");  
                      String gender1=(String)session.getAttribute("gender");  
                     String travellingClass1 =(String)session.getAttribute("travellingClass");  
                    Integer pnr1=(Integer)session.getAttribute("pnr"); */
                   
      
             out.println("<center><table border='2'>");
             out.println("<tr ><th colspan=5>"+"Your Ticket"+"</th></tr>");
               out.println("<tr><th> Passenger Name</th>"+"<th>Age</th>"+"<th>gender</th>"+"<th>Travelling Class</th>"+"<th>PNR</th>"+"</tr>");
      
               
              while(rs.next()){
              
                out.println("<tr>");
                out.println("<td>"+rs.getString(1)+"</td>");
                out.println("<td>"+rs.getInt(2)+"</td>");
                out.println("<td>"+rs.getString(3)+"</td>");
                out.println("<td>"+rs.getString(4)+"</td>");
               out.println("<td>"+rs.getInt(5)+"</td>");
                out.println("</tr>");
                out.println("</tr>");
               
               
              
            }
              out.println("<tr><th colspan=5><input type=\"submit\" value=\"Download Ticket\"></th></tr>");
               
            
               out.println("</table></center>");
            
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
