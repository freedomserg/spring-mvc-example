<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            <th>Phone number</th>
            <th>Salary</th>
        </tr>
            <tr>
                <td>${employee.name}</td>
                <td>${employee.surname}</td>
                <td>${employee.position}</td>
                <td>${employee.cell}</td>
                <td>${employee.salary}</td>

            </tr>
    </table>
</body>
</html>
