<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: michal
  Date: 02.05.2022
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>resultList</title>
</head>
<body>

<table>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>
                Title: ${book.title}, author: ${book.author}, isbn: ${book.isbn}
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
