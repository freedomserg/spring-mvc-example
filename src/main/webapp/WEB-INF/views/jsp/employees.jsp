<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table style="align-items: center">
        <tr>
            <th>First name</th>
            <th>Last name</th>
            <th>Position</th>
        </tr>
        <c:forEach items="${employees}" var="employee">
            <tr>
                <td>${employee.name}</td>
                <td><a href="/springmvcex/employee?employeeSurname=${employee.surname}">${employee.surname}</a></td>
                <td>${employee.position}</td>

            </tr>
        </c:forEach>
    </table>
</body>
</html>
