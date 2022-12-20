<%-- 
    Document   : nullerror
    Created on : Nov 12, 2022, 11:35:03 AM
    Author     : Dwight Kenneth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="CSS/design.jsp" />
    <title>Null Error Page</title>
</head>
<body>
    <div class="mainbox">
        <div class="err">
            <%response.setStatus(404);
            out.print(response.getStatus());%>
        </div>
        <div class="msg">
            <p>
                <%
                    response.setHeader("nullMessage", "The thing you requested was not found. :("); 
                    out.print(response.getHeader("nullMessage"));
                %>
            </p>
        </div>
    </div>
</body>
</html>