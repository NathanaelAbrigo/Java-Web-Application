/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class LoginServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userid=request.getParameter("userid");
        String password= request.getParameter("password");
        
        HttpSession session=request.getSession();
        if(password.equals("admin"))
        {
            session.setAttribute("userid", userid);
            response.sendRedirect("./ProfileServlet");
        }
        else
        {
            response.sendRedirect("login.html");
        }
    }

  
}
