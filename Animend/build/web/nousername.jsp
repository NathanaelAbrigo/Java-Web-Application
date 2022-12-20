<%-- 
    Document   : nousername
    Created on : 11 18, 22, 11:51:02 PM
    Author     : Lex Zedrick Lorenzo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/design.jsp" />
        <title>Error</title>
    </head>
    <body>
        <div class="mainbox">
            <div class="err">
                <%response.setStatus(401);
                out.print(response.getStatus());%>
            </div>
            <div class="msg">
                <p>
                    <%
                        response.setHeader("loginErrorMessage", "You cannot go to other pages without logging in."); 
                        out.print(response.getHeader("loginErrorMessage"));
                    %>
                </p>
                <p><a href="index.jsp">Go back to the login</a></p>
            </div>
        </div>
    </body>
</html>
