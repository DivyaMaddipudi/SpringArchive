<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<form:form action="displayUserInfo" modelAttribute="user">

Name: <form:input path="name"/>

<p>
Gender: <form:radiobuttons path="gender" items="${genderMap}" />

</p>

<p>
Country: <form:select path="country" items="${countryMap}" /> 
</p>

Introduction: <form:textarea path="introduction"/>
<p/>

Interests : 
TV Shows: <form:checkbox path="interests" value="TV Shows" />
Games: <form:checkbox path="interests" value="Games" />
Reading: <form:checkbox path="interests" value="Reading" />

<p/>

<input type="submit" value="Submit">
</form:form>
</body>
</html>
