<%-- 
    Document   : read
    Created on : 3 Dec 2021, 15:21:09
    Author     : shyam.r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Read from DB</h1>
        <table border="1" width="50%">
        <%  Connection conn = (Connection)getServletContext().getAttribute("db");
            Statement stmt = conn.createStatement();
            ResultSet set = stmt.executeQuery("select * from student");
            while (set.next()) { %>
                <tr>
                    <td><%= set.getString("studentid") %></td>
                    <td><%= set.getString("name") %></td>
                    <td><%= set.getString("age") %></td>
                </tr>
        <%  } %>
        </table>
    </body>
</html>
