<%--
  Created by IntelliJ IDEA.
  User: tummeng
  Date: 15/8/2021 AD
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Register [Spring MVC TAG]</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First Name : <form:input path="firstName"/>
        <br><br>
        Last Name : <form:input path="lastName"/>
        <br><br>
        <input type="submit" value="Submit"/>
    </form:form>

</body>
</html>
