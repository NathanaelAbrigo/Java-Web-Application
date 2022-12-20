<%-- 
    Document   : contentpage
    Created on : Nov 11, 2022, 11:38:39 PM
    Author     : Dwight Kenneth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <meta name="description" content="Content page of Anime Recommendation Website" />
        <title>Content Page</title>
        <style>
           body {
                background-color: #dedeed;
            }
 
            .main {
                width: 80%;
                margin-left: auto;
                margin-right: auto;
                max-width: 350px;
                padding-top: 80px;
            }

            img {
                height: 200px;
                display: block;
                margin-left: auto;
                margin-right: auto;
            }

            h2 {
                text-align: center;
            }

            label {
                padding-top: 20px;
            }

            header {
                width: 100%;
                height: 50px;
                background-color: #29183a;
                display: flex;
                justify-content: space-between;
                align-items: center;
                position: fixed;
                top: 0;
                margin-left: -10px;
            }

            h1 {
                font-size: min(5vw, 1.2em);
                text-align: center;
                padding: 0.2rem;
                margin: 0 10px 0.2rem;
            }

            .title {
                color: #5cc3e2;
            }

            a {
                text-decoration: none;
            }

            h3 {
                color: #c4e6f0;
                font-size: min(4vw, 1em);
                text-align: center;
            }

            .logout {
                color: #c4e6f0;
                font-size: min(4vw, 1em);
                text-align: center;
                padding: 0.2rem;
                margin: 0 0.2rem;
            }

            .logout:hover {
                background-color: #dfdfe2;
                color: #1b1b32;
                cursor: pointer;
            }

            .links {
                color: #161819;
                font-size: min(4vw, 1em);
                text-align: center;
            }

            .links:hover {
                background-color: #70709a;
                color: #1b1b32;
                cursor: pointer;  
            }
            footer {   
                width: 100%;
                height: 50px;
                background-color: rgb(219, 216, 216);
            }
            .footer-class{
                max-width: 50%;
                margin-left: auto;
                margin-right: auto;    
                margin-top: 20px;
                text-align: left;
                font-size: 14px;
                color: black;
            }    
        </style>
    </head>
    <body>
        
        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "0");

            if(session.getAttribute("username") == null)
                response.sendRedirect("nousername.jsp");
        
        %>
        
        <header>
            <h1><a class="title">ANIMEND</a></h1>
            <h3>Content Page Hello, <%session = request.getSession(); String val = (String)session.getAttribute("username"); out.print(val);%></h3>
            <a href="Logout" class="logout">Logout</a>
        </header>
        <main>
            <div class="main">
                <div class="top">
                    <img src="https://tinyurl.com/mumkdkpj" alt="Bleach poster">
                    <h2>Bleach: Sennen Kessen-hen</h2>
                </div>
                <div class="mid">
                    <fieldset>
                        <legend><h4>Description:</h4></legend>
                        <p>The peace is suddenly broken when warning sirens blare through the Soul Society. Residents are disappearing without a trace and nobody knows who's behind it. Meanwhile, darkness is approaching Ichigo and his friends in Karakura Town.</p>
                    </fieldset>
                </div>
                <div class="bottom">
                    <h4>Series Links:</h4>
                    <ul>
                        <li><a href="https://animesuge.to/anime/bleach-sennen-kessen-hen-w190l" class="links">animesuge.to</a></li>
                        <li><a href="https://animixplay.to/v1/bleach-sennen-kessen-hen" class="links">Animixplay.to</a></li>
                    </ul>
                </div>
            </div>
        </main>
        <footer>  
           <div class="footer-class">
               <p>Name: <%out.print(getServletContext().getInitParameter("lexName"));%>&emsp;&emsp;Email: <%out.print(getServletContext().getInitParameter("lexEmail"));%>&emsp;&emsp;Phone: <%out.print(getServletContext().getInitParameter("lexNum"));%></p>
               <p>Name: <%out.print(getServletContext().getInitParameter("dwightName"));%>&emsp;&emsp;Email: <%out.print(getServletContext().getInitParameter("dwightEmail"));%>&emsp;&emsp;Phone: <%out.print(getServletContext().getInitParameter("dwightNum"));%></p>
           </div> 
        </footer>    
    </body>
</html>