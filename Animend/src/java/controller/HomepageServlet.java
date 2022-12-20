/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.GenreSetter;
import model.SimilarSetter;
import java.util.List;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dwight Kenneth
 */
public class HomepageServlet extends HttpServlet {

    String t1t, t1u, t2t, t2u, t3t, t3u,t4t, t4u, t5t, t5u;
            
            
            @Override
            public void init(ServletConfig config) throws ServletException {
            super.init(config);
            t1t = config.getInitParameter("T1T");  
            t1u = config.getInitParameter("T1U"); 
            t2t = config.getInitParameter("T2T");  
            t2u = config.getInitParameter("T2U"); 
            t3t = config.getInitParameter("T3T");  
            t3u = config.getInitParameter("T3U"); 
            t4t = config.getInitParameter("T4T");  
            t4u = config.getInitParameter("T4U"); 
            t5t = config.getInitParameter("T5T");  
            t5u = config.getInitParameter("T5U"); 
            }
    
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
        
        //String val = request.getParameter("uName");
        //request.setAttribute("user", val);
        
        //New changes
        HttpSession session = request.getSession();
        String val = (String)session.getAttribute("username");
        
        //Mas bagong changes
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "0");
        
        if(session.getAttribute("username") == null)
            response.sendRedirect("nousername.jsp");
        else
        {
            try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">\n" +
                        "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "<meta name=\"description\" content=\"Home page of ANIMEND\" />\n" +
                        "<title>Home Page</title>");
            out.println("<style>");
            out.println(" header {\n" +
                        "width: 100%;\n" +
                        "height: 50px;\n" +
                        "background-color: #29183a;\n" +
                        "display: flex;\n" +
                        "justify-content: space-between;\n" +
                        "align-items: center;\n" +
                        "position: fixed;\n" +
                        "top: 0;\n" +
                        "margin-left: -10px;\n" +
                        "}" +  
                        "h1 {\n" +
                        "font-size: min(5vw, 1.2em);\n" +
                        "text-align: center;\n" +
                        "padding: 0.2rem;\n" +
                        "margin: 0 10px 0.2rem;\n" +
                        "}\n" +
                        " \n" +
                        ".title {\n" +
                        "color: #5cc3e2;\n" +
                        "}\n" +
                        "\n" +
                        "a {\n" +
                        "text-decoration: none;\n" +
                        "}\n" +
                        " \n" +
                        "h3 {\n" +
                        "color: #c4e6f0;\n" +
                        "font-size: min(4vw, 1em);\n" +
                        "text-align: center;\n" +
                        "}\n" +
                        "\n" +
                        ".logout {\n" +
                        "color: #c4e6f0;\n" +
                        "font-size: min(4vw, 1em);\n" +
                        "text-align: center;\n" +
                        "padding: 0.2rem;\n" +
                        "margin: 0 0.2rem;\n" +
                        "}\n" +
                        " \n" +
                        ".logout:hover {\n" +
                        "background-color: #dfdfe2;\n" +
                        "color: #1b1b32;\n" +
                        "cursor: pointer;\n" +
                        "}");
            out.println("footer {\n" +
                        "width: 100%;\n" +
                        "height: 50px;\n" +
                        "background-color: rgb(219, 216, 216);\n" +
                        "}\n" +
                        ".footer-class{\n" +
                        "max-width: 80%;\n" +
                        "margin-left: auto;\n" +
                        "margin-right: auto;\n" +
                        "margin-top: 20px;\n" +
                        "padding-top: 10px;\n" +
                        "text-align: left;\n" +
                        "font-size: 14px;\n" +
                        "color: black;\n" +
                        "}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>\n" +
                        "<h1 class=\"title\">ANIMEND</h1>\n" +
                        "<h3>Hello, "+val+"!</h3>\n" +
                        "<a href=\"Logout\" class=\"logout\">Logout</a>\n" +
                        "</header>");
           
            
            String from = (String)request.getAttribute("from");
            
            List<String> list = new ArrayList<>();
            list.add("Top Airing Animes");
            list.add(t1u);
            list.add(t1t);
            list.add(t2u);
            list.add(t2t);
            list.add(t3u);
            list.add(t3t);
            list.add(t4u);
            list.add(t4t);
            list.add(t5u);
            list.add(t5t);
            
            request.setAttribute("topAirings", list);
            RequestDispatcher viewTopAirings = 
                            request.getRequestDispatcher("topairingdisplay.jsp");
                   viewTopAirings.include(request, response);
            
            if(from!=null)
            {
                String choice1 = (String)request.getAttribute("genre1");
                GenreSetter gs1 = new GenreSetter();
                List selection1 = gs1.Genres(choice1);

                request.setAttribute("anime", selection1);

                RequestDispatcher viewGenre = 
                            request.getRequestDispatcher("genredisplay.jsp");
                   viewGenre.include(request, response);

                String choice2 = (String)request.getAttribute("anime1");
                SimilarSetter ss2 = new SimilarSetter();
                List selection2 = ss2.Similars(choice2);

                request.setAttribute("anime", selection2);

                RequestDispatcher viewSimilar = 
                            request.getRequestDispatcher("similardisplay.jsp");
                   viewSimilar.include(request, response);
            }
            else{
                String choice1 = request.getParameter("genre");
                GenreSetter gs1 = new GenreSetter();
                List selection1 = gs1.Genres(choice1);
            
                String choice2 = request.getParameter("anime");
                SimilarSetter ss2 = new SimilarSetter();
                List selection2 = ss2.Similars(choice2);

                if(selection1==null||selection2==null)
                    response.sendRedirect("/Animend/nullerror.jsp");
                else {
                request.setAttribute("anime", selection1);

                RequestDispatcher viewGenre = 
                            request.getRequestDispatcher("genredisplay.jsp");
                   viewGenre.include(request, response);

                request.setAttribute("anime", selection2);

                RequestDispatcher viewSimilar = 
                            request.getRequestDispatcher("similardisplay.jsp");
                   viewSimilar.include(request, response);
                }
            }
            out.println("<footer>\n" +
                          "<div class=\"footer-class\">\n" +
                          "<p>Name: " + getServletContext().getInitParameter("lexName") + "&emsp;&emsp;Email: " + getServletContext().getInitParameter("lexEmail") + "&emsp;&emsp;Phone: " + getServletContext().getInitParameter("lexNum") + "</p>\n" +
                          "<p>Name: " + getServletContext().getInitParameter("dwightName") + "&emsp;&emsp;Email: " + getServletContext().getInitParameter("dwightEmail") + "&emsp;&emsp;Phone: " + getServletContext().getInitParameter("dwightNum") + "</p>\n" +
                          "</div>\n" +
                          "</footer>");  
            out.println("</body>");
            out.println("</html>");
            }
            
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
