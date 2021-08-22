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
        Country :
        <form:select path="country">
        <%--
            <form:option value="BR" label="Brazil"/>
            <form:option value="FR" label="France"/>
            <form:option value="DE" label="Germany"/>
            <form:option value="IN" label="India"/>
        --%>
            <form:options items="${theCountryOptions}"/>
        </form:select>
        <br><br>
        Favorite Language :
        <%--
        Java <form:radiobutton path="favoriteLanguage" value="Java" />
        C# <form:radiobutton path="favoriteLanguage" value="C#" />
        PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
        Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
        --%>
        <form:radiobuttons path="favoriteLanguage" items="${languageOptions}"/>

        <br><br>
        <input type="submit" value="Submit"/>
    </form:form>

</body>
</html>
