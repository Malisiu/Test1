<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: michal
  Date: 02.05.2022
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp2.jsp</title>
</head>
<body>

<c:forEach var="num" begin="${start}" end="${end}">
    <div>${num}</div>
</c:forEach>



</body>
</html>
