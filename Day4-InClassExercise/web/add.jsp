<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add New Student</h1>
        
        <form action="AddServlet">
            Student Id: <input type="text" name="studentid" /><br>
            Name: <input type="text" name="name" /><br>
            Age: <input type="text" name="age" /><br>
            <input type="submit" value="Add" />
        </form>
    </body>
</html>
