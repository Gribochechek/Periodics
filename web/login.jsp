<%--
  Created by IntelliJ IDEA.
  User: gribo
  Date: 29.08.2018
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="language" value="${not empty param.language ? param.language : not empty language ? language : 'eng'}" scope="session" />
<fmt:setLocale value="${language}" />
<fmt:setBundle basename="text" />

<html lang="${language}">
<head>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <title>Login</title>
</head>
<body>

<form class="form-inline" action="login.jsp">
    <select class="custom-select" id="language" name="language" onchange="submit()">
        <option value="eng" ${language == 'eng' ? 'selected' : ''}>English</option>
        <option value="ukr" ${language == 'ukr' ? 'selected' : ''}>Ukrainian</option>
    </select>
</form>
<h1><fmt:message key="sign_in_message"/></h1><br/>

<form class="form-signin" method="post" action="${pageContext.request.contextPath}/servlet">

    <input type="hidden" name="command" value="logIn">
    <label for="email" >Email address</label>
    <input type="text" id="email" name="login"><br/>
    <label for="password">Password </label>
    <input type="password" id="password" name="pass"><br/><br/>
    <input class="button" type="submit" value="Войти">

</form>
<br/>
</body>
</html>
