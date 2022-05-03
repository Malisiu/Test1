<%--
  Created by IntelliJ IDEA.
  User: michal
  Date: 02.05.2022
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp3</title>
</head>
<body>

    <form action="mvc13" method="post">
        <div>
            <label for="title">Title:</label>
            <br>
            <input id="title" name="title" type="text">
        </div>
        <div>
            <label for="author">Author:</label>
            <br>
            <input id="author" name="author" type="text">
        </div>
        <div>
            <label for="isbn">Isbn:</label>
            <br>
            <input id="isbn" name="isbn" type="text">
        </div>
        <div>
            <input type="submit" value="Submit">
        </div>
    </form>


</body>
</html>
