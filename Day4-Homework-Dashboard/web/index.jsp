<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    if (application.getAttribute("db")==null) {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitydb", "root", "123456789");
        application.setAttribute("db", conn);
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="AddEditSearchDiv">
            <h3 align="center">Add/Edit/Search Data</h3>
            <form action="AddEditSaveServlet">
                <table align="center">
                    <tr>
                        <td>Student ID</td>
                        <td colspan="2"><input id="s" type="text" name="studentid"></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td colspan="2"><input id="n" type="text" name="name"></td>
                    </tr>
                    <tr>
                        <td>Age</td>
                        <td colspan="2"><input id="a" type="text" name="age"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit"></td>
                        <td><input type="reset" value="Clear"></td>
                        <td><input type="button" value="Search" onclick="searchData()"></td>
                    </tr>
                </table>
            </form>
        </div>
        <br>
        <div id="DisplayDiv">
            <table align="center" border="1" width="50%">
                <tr>
                    <td align="center"><b>Student ID</b></td>
                    <td align="center"><b>Name</b></td>
                    <td align="center"><b>Age</b></td>
                    <td align="center"><b>Actions</b></td>
                </tr>
                <% Connection conn = (Connection)application.getAttribute("db");
                    Statement stmt = conn.createStatement();
                    
                    String sid = request.getParameter("sid");
                    String name = request.getParameter("name");
                    String age = request.getParameter("age");
                    
                    String sql = "select * from student";
                    if (request.getParameter("s")!=null) {
                        sql += " where studentid="+sid+" and name='"+name+"' and age="+age;
                    }
                    
                    ResultSet res = stmt.executeQuery(sql);
                    while (res.next()) { %>
                    <tr>
                        <% int id = res.getInt("studentid"); %>
                        <td id="s<%=id %>" align="center"><%= id %></td>
                        <td id="n<%=id %>" align="center"><%= res.getString("name") %></td>
                        <td id="a<%=id %>" align="center"><%= res.getInt("age") %></td>
                        <td align="center">
                            <input type="button" value="Edit" onclick="loadData(<%=id %>)" >
                            <input type="button" value="Delete" onclick="deleteData(<%=id %>)">
                        </td>
                    </tr>
                <% } %>
            </table>
        </div>
    </body>
    <script type="text/javascript">
        function deleteData(id) {
            window.location = "DeleteServlet?id="+id;
        }
    
        function loadData(id) {
            document.getElementById('s').value = document.getElementById('s'+id).innerHTML;
            document.getElementById('n').value = document.getElementById('n'+id).innerHTML;
            document.getElementById('a').value = document.getElementById('a'+id).innerHTML;
        }
        
        function searchData() {
            var studentid = document.getElementById('s').value;
            var name = document.getElementById('n').value;
            var age = document.getElementById('a').value;
            
            window.location = "index.jsp?s=0&sid="+studentid+"&name="+name+"&age="+age;
        }
    </script>
</html>
