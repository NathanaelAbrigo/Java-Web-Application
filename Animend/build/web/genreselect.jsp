<%-- 
    Document   : genreSelect
    Created on : Nov 8, 2022, 3:37:48 PM
    Author     : Dwight Kenneth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <meta name="description" content="Genre and Watched Anime Selection of Anime Recommendation Website" />
        <title>Genre Selection Page</title>
        <style>
            * {
                text-align: center;
            }
 
            body {
                background-color: #dedeed;
            }
           
            form {
                        max-width: 500px;
                        min-width: 300px;
                        margin: 0 auto;
                        padding-bottom: 2em;
                    }
            div {
                        border: 1px solid black;
                        width: 400px;
                        margin: 50px auto;
                        padding: 10px 10px 30px 15px
                    }        
            select  {
                        margin: 20px auto;
                        text-transform: uppercase;
                        font-weight: 500;
                        color: #000;
                        transition: all 0.3s ease 0s;
                    }
            option  {
                        text-transform: uppercase;
                        font-weight: 500;
                        color: #000;
                    }
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
            fieldset {
                        border: none;
                        padding: 2rem 0;
                        border-bottom: 1px solid;
                        vertical-align: middle;
                    }
            img {
                height: 200px;
                width: 150px;
            }
 
            /*DropBox*/
            select {
                background-color:#b3d7e6;
                background-position: right 10px center;
                background-repeat: no-repeat;
                background-size: auto 50%;
                border-radius:5px;
                color: #000000;
                padding: 10px 30px 10px 10px;
            }
 
        </style>
    </head>
    <body>
        
        <div>
            <form method="get" action="homepage">
                <h3>Hello <%String val = request.getParameter("uName"); %><%=val%>, select the genre you want to watch:</h3>
                <input type="hidden" name="uName" value="<%=val%>">
                    <select name="genre" size="1">
                        <option value="1">Comedy</option>
                        <option value="2">Horror</option>
                        <option value="3">Romance</option>
                        <option value="4">Action</option>
                        <option value="5">Drama</option>
                    </select>
                   
                    <br><br>
                <fieldset name="animee">
                    <legend>Select one of these shows that interests you:</legend>
                        <input id="Gintama" type="radio" name="anime" class="inline" value="1" checked>
                        <img src="https://tinyurl.com/k3ruwthr" alt="Gintama poster">
                        <input id="Another" type="radio" name="anime" class="inline" value="2">
                        <img src="https://tinyurl.com/ycx43rce" alt="Another poster">
                    <br>
                        <input id="Toradora" type="radio" name="anime" class="inline" value="3">
                        <img src="https://tinyurl.com/y92yxy43" alt="Toradora poster">
                        <input id="My-Hero-Academia" type="radio" name="anime" value="4">
                        <img src="https://tinyurl.com/26exsh6j" alt="My Hero Academia poster">
                    <br>
                        <input id="Clannad" type="radio" name="anime" class="inline" value="5">
                        <img src="https://tinyurl.com/5cvbwse2" alt="Clannad poster">
                </fieldset>
                <br><br>
                <button >Submit</button>
            </form>
        </div>
    </body>
</html>
