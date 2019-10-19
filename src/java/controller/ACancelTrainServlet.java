/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.AcancelTrainDao;
import java.io.IOException;
import java.io.PrintWriter;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AcancelDao;
//import model.canceldao;
//import model.reservebean;
import model.trainbean;

/**
 *
 * @author Mohini
 */
public class ACancelTrainServlet extends HttpServlet {

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
           
           String p=request.getParameter("trainno");
            int trainno=Integer.parseInt(p);
            
            trainbean bean=new trainbean();
            bean.setTrainno(trainno);
            int status=AcancelDao.cancelTrain(bean);
            /* HttpSession session=request.getSession(false);
            Integer pnr1=(Integer)session.getAttribute("pnr"); */
      
            if(status>0){
            out.println("<script>");
            out.println("alert('Train Cancelled  Successfully....')");
            out.println("(window.location='view/ACheckTrain.html')");
            out.println("</script>"); 
           //response.sendRedirect("view/Ahome.html");
            }
            else{
             out.println("<script>");  
            out.println("alert('Train not Found')");
            out.println("(window.location='view/AcancelTrain.html')");
            out.println("</script>");
            //response.sendRedirect("view/AcancelTrain.html");
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
