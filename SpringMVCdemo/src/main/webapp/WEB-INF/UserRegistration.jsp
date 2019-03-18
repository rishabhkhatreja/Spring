<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ttn
  Date: 18/3/19
  Time: 5:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--@elvariable id="user" type="Controller.User"--%>
<form:form method="POST" action="/Question9/submitForm"
           modelAttribute="user" >
    <form:label path="firstName">First Name:</form:label>
    <form:input path="firstName" />

    <form:label path="lastName">Last Name:</form:label>
    <form:input path="lastName" />

    <input type="submit" value="Submit" />
</form:form>
</body>
</html>
