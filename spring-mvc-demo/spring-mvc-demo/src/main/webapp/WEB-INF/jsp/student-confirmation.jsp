<%--
  Created by IntelliJ IDEA.
  User: tummeng
  Date: 15/8/2021 AD
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student Confirm</title>
</head>
<body>
<h2>The student is confirmed : ${student.firstName} ${student.lastName} [ ${student.country}]</h2>
<h2>Favorite Language : ${student.favoriteLanguage}</h2>
<h2>Favorite OS : </h2>
<ul>
    <c:forEach var="item" items="${student.favoriteOS}">
        <li>${item}</li>
    </c:forEach>
</ul>
<br><br>

</body>
</html>
