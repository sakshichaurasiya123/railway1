/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.regDao;
import model.regbean;

/**
 *
 * @author Mohini
 */
public class regservlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            try {

           String username=request.getParameter("username");
        //String mno=(String)request.getParameter("mno");
           
           String email=request.getParameter("email");
           String password=request.getParameter("pass");
           String cpassword=request.getParameter("cpass");
        
            
            regbean b=new regbean();
           b.setUsername(username);
          //  b.setMno(mno);
            b.setEmail(email);
            b.setPassword(password);
            b.setCpassword(cpassword);
            //request.setAttribute("b", b);
            int status=regDao.insert(b);
           // boolean status=b.validate();
            /*HttpSession session=request.getSession();
            session.setAttribute("email",email);*/
            /*if(password.equals(cpassword)){
            response.sendRedirect("view/login.html");
            }
            else{
                out.println("Password and Confirm password does not Match");
                response.sendRedirect("view/registration.html");
            }*/
            /*if(password.equals("")||cpassword.equals("")){
              response.sendRedirect("view/login.html");  
            }
            else{
            out.println("You should try again Password and confirm password does not match");
            response.sendRedirect("view/registration.html");
            }*/
            
            if(status>0){
                out.println("<script>");
                out.println("alert('Record Inserted Successfully')");
                out.println("(window.location='view/login.html')");
                //response.sendRedirect("view/login.html");
                out.println("</script>");
            }
            else{
                out.println("<script>");
            out.println("alert('This Account is Already Registered')");
            out.println("(window.location='view/registration.html')");
           // RequestDispatcher rd=request.getRequestDispatcher("view/registration.html");
            out.println("</script>");
            //rd.forward(request,response);
        }

         }
         catch(Exception ex){
     
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
