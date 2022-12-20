<%-- 
    Document   : notavailable error
    Created on : Nov 10, 2022, 3:53:33 PM
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
    <title>Not Available Error Page</title>
</head>
<body>
    <div class="mainbox">
        <div class="err">
            <%response.setStatus(503);
            out.print(response.getStatus());%>
        </div>
        <div class="msg">
            <p>
                <%
                    response.setHeader("notAvailableMessage", "The content that you are looking for is not available. :("); 
                    out.print(response.getHeader("notAvailableMessage"));
                    response.setHeader("notAvailableMessage2", "Please wait for further update of this webapp."); 
                    out.print(response.getHeader("notAvailableMessage2"));
                %>
            </p>
        </div>
    </div>
</body>
</html>