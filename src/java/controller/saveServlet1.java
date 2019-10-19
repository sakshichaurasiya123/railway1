/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.regbean;
import model.revDao;
import uni.serives.DB;

/**
 *
 * @author Mohini
 */
public class saveServlet1 extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
           String name=request.getParameter("name");
           String password=request.getParameter("password");
           HttpSession session=request.getSession();
          session.setAttribute("name",name);
          session.setAttribute("password",password);
        
            
        Connection con=DB.getConnection();
        PreparedStatement  ps=con.prepareStatement("select username,password from registration where username=? and password=? ");
        
        ps.setString(1,name);
        ps.setString(2,password); 
       
      
       ResultSet rs=ps.executeQuery();
       /*
      HttpSession session1=request.getSession();
     session1.getAttribute("name");
        */
     
            
      
            if(rs.next())
            {
            
            response.sendRedirect("view/train.jsp");
            
            
           
            }else{
                //out.println("sakshi");
             out.println("<script>");
             out.println("alert('This Account is not found "
                     + "Please You should do Registration first then Login')");
             out.println("(window.location='view/login.jsp')");
             out.println("</script>");
           // response.sendRedirect("view/login.html");
                
            }
            }catch(Exception e) {
            out.close();
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
