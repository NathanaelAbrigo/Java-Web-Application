/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import model.UserList;
/**
 *
 * @author Lex Zedrick Lorenzo
 */
public class AfterLogin extends HttpServlet {

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
        checking(request, response);
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AfterLogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AfterLogin at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        
    }
    
    public void checking(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String user = request.getParameter("uName");
        String pass = request.getParameter("pass");
        UserList ul = new UserList();
        ul.setAll();
        Map<String, String> userListMap = ul.getUserListMap();
        List<String> gensiList = ul.getGensiList();
        List<String> userArrangement = ul.getuserArrangement();
        System.out.println(gensiList);
        System.out.println(userArrangement + "usser arrange");
        if(pass.equals(userListMap.get(user)))
        {
            System.out.println("tama password");
            int index = userArrangement.indexOf(user);
            String  genre = gensiList.get(index * 2);
            String  similar = gensiList.get(index * 2 + 1);
            request.setAttribute("genre1", genre);
            request.setAttribute("anime1", similar);
            //request.setAttribute("uName", user);
            request.setAttribute("from", "login");
            //New changes
            HttpSession session = request.getSession();
            session.setAttribute("username", user);
            RequestDispatcher view = request.getRequestDispatcher("homepage");
            view.forward(request, response);
        }
        else
        {
            response.sendRedirect("loginerror.jsp");
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
