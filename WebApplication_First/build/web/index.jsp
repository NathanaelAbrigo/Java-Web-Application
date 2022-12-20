<%-- 
    Document   : index
    Created on : 09 29, 22, 2:54:56 PM
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
        <h1>My Date JSP</h1>
        <h2>The date today is: </h2>
        <br><!-- comment -->
        <%= new java.util.Date() %>
    </body>
</html>
