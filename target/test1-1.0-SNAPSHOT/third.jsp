<%--
  Created by IntelliJ IDEA.
  User: michal
  Date: 02.05.2022
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>third.jsp</title>
</head>
<body>

    ${empty param.a || empty param.b ? "niepoprawne dane": param.a.concat(param.b)}


</body>
</html>
