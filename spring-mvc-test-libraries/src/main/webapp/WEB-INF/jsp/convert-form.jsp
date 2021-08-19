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
    <title>Converter</title>
</head>
<body>
<form:form action="processForm" modelAttribute="convertInfo">
    Source : <form:input path="source"/>
    <br><br>
    Destination : <form:input path="destination"/>
    <br><br>
    <input type="submit" value="Convert"/>
</form:form>

</body>
</html>
