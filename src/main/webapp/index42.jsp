<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: michal
  Date: 03.05.2022
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index42.jsp</title>
</head>
<body>

<c:forEach begin="2" end="10" step="2" var="num">
    <div>${num}</div>
</c:forEach>

</body>
</html>
