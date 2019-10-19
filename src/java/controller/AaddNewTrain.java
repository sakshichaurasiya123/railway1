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
import model.AinsertDao;
import model.trainbean;

/**
 *
 * @author Mohini
 */
public class AaddNewTrain extends HttpServlet {

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
               String no=request.getParameter("trainno");
               int trainno=Integer.parseInt(no);
               String trainname=request.getParameter("trainname");
               String source=request.getParameter("source");
               String  destination =request.getParameter("destination");
               String arrivaltime=request.getParameter("arrivaltime");
               String departuretime=request.getParameter("departuretime");
               String journeydate=request.getParameter("journeydate");
               //out.println("hello");
               trainbean bean=new trainbean();
               bean.setTrainno(trainno);
               bean.setTrainname(trainname);
               bean.setSource(source);
               bean.setDestination(destination);
               bean.setArrivaltime(arrivaltime);
               bean.setDeparturetime(departuretime);
               bean.setDateofjourney(journeydate);
               int status=AinsertDao.insert(bean);
               //out.println("sakshi");
               if(status>0){
                   out.println("<script>");
                   out.println("alert('Train Insert Successfully')");
                   out.println("(window.location='view/AaddNewTrain.html')");
                   out.println("</script>");
                 //response.sendRedirect("view/AaddNewTrain.html");
               }
               else{
                   out.println("<script>");
                   out.println("alert('You Are Not Able To insert Train') ");
                   out.println("(window.location='view/AaddNewTrain.html')");
                   out.println("</script>");
                  // response.sendRedirect("view/AaddNewTrain.html");
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
