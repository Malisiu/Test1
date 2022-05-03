<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: michal
  Date: 03.05.2022
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index41.jsp</title>
</head>
<body>
<c:if test="${param.author != null}">
    <p>${empty param.author ?"Brak autora " :"Wybrany autor to "}${param.author}</p>
</c:if>




</body>
</html>
