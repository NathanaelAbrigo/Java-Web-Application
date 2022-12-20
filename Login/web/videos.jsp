<%-- 
    Document   : videos
    Created on : 11 19, 22, 3:19:18 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//HTTP 1.1
            response.setHeader("Pragma", "no-cache");//HTTP 1.0
            response.setHeader("Expires","0");//Proxies
            
            if(session.getAttribute("username") == null)
            {
                response.sendRedirect("login.jsp");
            }
        %>
        
        <iframe width="560" height="315" src="https://www.youtube.com/embed/cYc3FjhMMzI" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    </body>
</html>
