/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.reserveDao;
import model.reservebean;

/**
 *
 * @author Mohini
 */
public class reserveservlet extends HttpServlet {

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
            //out.println("sakshi");
            String name=request.getParameter("name");
            // out.println("hello "+name);
            String age = request.getParameter("age");
            int a=Integer.parseInt(age);
             //out.println("sakshi "+a);
            String gender=request.getParameter("gender");
             //out.println("sakshi "+gender);
           /* String bookingDate=request.getParameter("bookingDate");
            int bookDate=Integer.parseInt("bookingDate");
            out.println("sakshi "+bookDate);*/
            String travellingClass=request.getParameter("travellingClass");
            out.println("hello "+travellingClass);
           String p = request.getParameter("pnr");
            int pnr=Integer.parseInt(p);
            out.println("PNR");
            
            reservebean bean=new reservebean();
            bean.setName(name);
            bean.setAge(a);
            bean.setGender(gender);
           // bean.setBookingDate(bookDate);
            bean.setTravellingClass(travellingClass);
            bean.setPNR(pnr);
            
            //out.println("h r u");
            int status=reserveDao.reservation(bean);
      
            //out.println(" i am fine");
            if(status>0){
                out.println("<script>");
            out.println("alert('reservation Successfully')");
            out.println("(window.location='fetchreserverecord')");
            out.println("</script>");
            //response.sendRedirect("fetchreserverecord");
            //response.sendRedirect("fetchreserverecord");
            }
            else{
                out.println("<script>");
            out.println("alert('This Seat Already BOok!!')");
            out.println("(window.location='view/reservation.html')");
            out.println("</script>");
            //response.sendRedirect("view/reservation.html");
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
