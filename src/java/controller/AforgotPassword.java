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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uni.serives.DB;

/**
 *
 * @author Mohini
 */
public class AforgotPassword extends HttpServlet {

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
        int status=0;
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("hello");
            String email=request.getParameter("email");
           String password=request.getParameter("password");
           String cpassword=request.getParameter("cpassword");
          
            out.println("sakshi");
            Connection con=DB.getConnection();
             PreparedStatement ps=con.prepareStatement("update alogin set password=? , cpassword=? where email=?"); 
            
           ps.setString(1,password);
            ps.setString(2,cpassword);
             ps.setString(3,email);
             status=ps.executeUpdate();
            
      /* regbean bean=new regbean();
       bean.setEmail(email);
       bean.setPassword(password);
       bean.setCpassword(cpassword);
       out.println("muskan");
       int status=forgotDao.update(bean);*/
      // out.println("chaurasiya");
       if(status>0 && password.equals(cpassword)){
           out.println("<script>");
       out.println("alert('Update Successfully!!!')");
       out.println("(window.location='view/forgotPassword.html')");
      // response.sendRedirect("view/forgotPassword.html");
       out.println("</script>");
       }
       else{
           out.println("<script>");
       out.println("alert('We can't able to update password!!!')");
        out.println("(window.location='view/forgotPassword.html')");
       out.println("</script>");
        //response.sendRedirect("view/forgotPassword.html");
      
       
       }
       
           
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
