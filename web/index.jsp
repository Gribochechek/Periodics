<%--
  Created by IntelliJ IDEA.
  User: gribo
  Date: 28.08.2018
  Time: 15:17
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
    <title><fmt:message key="welcome"></fmt:message> </title>
</head>
<body>

Hello! <br>

<c:if test="${ not empty requestScope.result}">
    <c:out value="${requestScope.result}"/>
</c:if>


<br> <a  href="login.jsp" style="float: left"> Login </a>


</body>
</html>
