<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Page</h1>
        
        <form action="LoginServlet">
            username: <input type="text" name="username" /><br>
            password: <input type="password" name="password"><br>
            <input type="submit" value="Login">
            <input type="reset" value="Clear">
        </form>
        
        <% if (request.getParameter("z")!=null) { %>
            <p>Incorrect Login Details</p>  
        <% } %>
    </body>
</html>
