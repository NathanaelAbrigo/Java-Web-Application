<%-- 
    Document   : loginerror
    Created on : Nov 12, 2022, 11:34:07 AM
    Author     : Dwight Kenneth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@600;900&display=swap" rel="stylesheet">
    <script src="https://kit.fontawesome.com/4b9ba14b0f.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="CSS/design.jsp" />
    <title>Login Error Page</title>
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
                    response.setHeader("loginErrorMessage", "You've either inputted an incorrect password or an incorrect username."); 
                    out.print(response.getHeader("loginErrorMessage"));
                %>
            </p>
            <p></p>
        </div>
    </div>
</body>
</html>