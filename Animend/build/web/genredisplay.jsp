<%-- 
    Document   : template
    Created on : Nov 10, 2022, 11:42:34 AM
    Author     : Dwight Kenneth
--%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Home page of ANIMEND" />
        <title>Homepage Row</title>
        <style>
             main {
                margin-top: 50px;
                max-width: 90%;
                margin-left: auto;
                margin-right: auto;
            }
 
            section {
                display: flex;
                flex-direction: row;
                justify-content: space-evenly;
                flex-wrap: nowrap;
            }
 
            div {
                max-width: 150px;
            }
 
            img {
                height: 200px;
                width: 150px;
            }
 
            p {
                margin-top: -5px;
                text-align: center;
            }
 
            hr {
                margin-top: -20px;
                height: 1px;
                background-color: #29183a;
                border-color: #29183a;
            }
        </style>
    </head>
    <body>
        <main>
            <%
                List animes = (List)request.getAttribute("anime");
            %>
            <h4><%out.print(animes.get(0));%></h4>
            <hr>
            <section>
                <div>
                    <a href="notavailableerror.jsp">
                        <img src="<%out.print(animes.get(1));%>" alt="<%out.print(animes.get(2)+" poster");%>">
                        <p><%out.print(animes.get(2));%></p>
                    </a>
                </div>
                <div>
                    <a href="notavailableerror.jsp">
                        <img src="<%out.print(animes.get(3));%>" alt="">
                        <p><%out.print(animes.get(4));%></p>
                    </a>
                </div>
                <div>
                    <a href="notavailableerror.jsp">
                        <img src="<%out.print(animes.get(5));%>" alt="">
                        <p><%out.print(animes.get(6));%></p>
                    </a>
                </div>
                <div>
                    <a href="notavailableerror.jsp">
                        <img src="<%out.print(animes.get(7));%>" alt="">
                        <p><%out.print(animes.get(8));%></p>
                    </a>
                </div>
                <div>
                    <a href="notavailableerror.jsp">
                        <img src="<%out.print(animes.get(9));%>" alt="">
                        <p><%out.print(animes.get(10));%></p>
                    </a>
                </div>
            </section>
        </main>
    </body>
</html>
