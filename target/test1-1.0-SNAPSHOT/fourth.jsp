<%--
  Created by IntelliJ IDEA.
  User: michal
  Date: 02.05.2022
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>fourth.jsp</title>
</head>
<body>

<p>${empty cookie.foo.value ? "Brak ciasteczka o nazwie foo":"Wartość ciasteczka foo: ".concat({cookie.foo.value})}</p>

</body>
</html>
