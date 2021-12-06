<%-- 
    Document   : index
    Created on : 3 Dec 2021, 12:03:33
    Author     : shyam.r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    if (session.getAttribute("user")==null) {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <a href="MyServlet">Connect to DB</a>
        <% String result = request.getParameter("x");
            if (result!=null && result.equals("0")) { %>
                <p>Success</p>
        <% } %>
        
        <br/><br/>
        <a href="add.jsp">Add to DB</a>
        <% result = request.getParameter("y");
            if (result!=null && result.equals("0")) { %>
                <p>Success</p>
        <% } %>
        
        <br/><br/>
        <a href="read.jsp">Read from DB</a>
        
        <br/><br/>
        <a href="LogoutServlet">Logout <%= session.getAttribute("user") %></a>
                
    </body>
</html>
