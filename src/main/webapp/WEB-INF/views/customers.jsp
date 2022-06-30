<%--
  Created by IntelliJ IDEA.
  User: fcheb
  Date: 6/30/2022
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customers</title>
</head>
<body>
    <table>
        <tr>
            <th>Name</th>
            <th>Email</th>
        </tr>
        <c:forEach items="${customers}" var="c">
            <tr>
                <td>${c.name}</td>
                <td>${c.email}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
