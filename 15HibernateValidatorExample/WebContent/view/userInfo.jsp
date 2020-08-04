<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>
<h1>Submit user information</h1>
<hr>
<form:form action="displayname" modelAttribute="user">
Name: <form:input path="name" required="true" placeholder="Enter name"/>
<p/>
Gender: <form:radiobuttons items="${genderMap}" path="gender" required="true"/>
<p/>
Introduction: <form:textarea path="introduction"/>
<p/>
<input type="submit" value="Submit">
</form:form>
</body>
</html>