<%-- 
    Document   : signup
    Created on : Nov 8, 2022, 3:19:59 PM
    Author     : Dwight Kenneth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <meta name="description" content="Register page of Anime Recommendation Website" />
        <title>Register Page</title>
        <style>
            body {
                background-color: #dedeed;
            }

            form {
                width: 80%;
                display: block;
                margin-left: auto;
                margin-right: auto;
                max-width: 300px;
            }

            div {
                border: 1px solid black;
                width: 300px;
                margin: 50px auto;
                padding: 10px 10px 30px 15px
            }

            h2 {
                text-align: center;
            }

            /*text field*/
            .username-password {
                line-height: 28px;
                border: 2px solid transparent;
                border-bottom-color: #777;
                padding: .2rem 0;
                outline: none;
                background-color: transparent;
                color: #0d0c22;
                transition: .3s cubic-bezier(0.645, 0.045, 0.355, 1);
                margin-left: 10%;
                margin-bottom: 10px;
            }

            .username-password:focus, input:hover {
                outline: none;
                padding: .2rem 1rem;
                border-radius: 1rem;
                border-color: #7a9cc6;
            }

            .username-password::placeholder {
                color: #777;
            }

            .username-password:focus::placeholder {
                opacity: 0;
                transition: opacity .3s;
            }  
            /*Button*/
            button {
                padding: 1.3em 3em;
                font-size: 12px;
                text-transform: uppercase;
                letter-spacing: 2.5px;
                font-weight: 500;
                color: #000;
                background-color: #dedeed;
                border: none;
                border-radius: 45px;
                box-shadow: 0px 8px 15px rgba(0, 0, 0, 0.1);
                transition: all 0.3s ease 0s;
                cursor: pointer;
                outline: none;
                margin-top: 15px;
                margin-left: 40px;
            }

            button:hover {
                background-color: #1b1b32;
                box-shadow: 0px 15px 20px #1b1b32;
                color: #dedeed;
                transform: translateY(-7px);
            }

            button:active {
                transform: translateY(-1px);
            }

            a {
                color: #0060B6;
                text-decoration: none;

            }

            a:hover {
                color:#00A0C6;
                text-decoration:none;
                cursor:pointer;  
            }
        </style>
    </head>
    <body>
        <div>  
            <form name="regForm" action="genreselect.jsp">
                <h2 id="Anime-Recommendation">ANIMEND</h2>
                <input placeholder="Username*" name=uName type="text" class="username-password" required>
                <input placeholder="Email Address*" type="email" class="username-password" required>
                <input placeholder="Password*" type="password" class="username-password" required>
                <button>Register</button>
            </form>
        </div>
    </body>
</html>
