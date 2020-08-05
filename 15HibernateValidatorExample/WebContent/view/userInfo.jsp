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
Country: <form:select path="country" items="${countryMap}"/>
<p/>
Introduction: <form:textarea path="introduction"/>
<p/>
Interests: 
<p/>
Games: <form:checkbox path="interests" value="Games"/>
<p/>
TV Shows: <form:checkbox path="interests" value="TV Shows"/>
<p/>
Reading: <form:checkbox path="interests" value="Reading"/>
<p/>
News: <form:checkbox path="interests" value="News"/>
<p/>
<input type="submit" value="Submit">
</form:form>
</body>
</html>