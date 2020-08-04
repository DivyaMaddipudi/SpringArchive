<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/files/css/style.css" >
</head>
<body>
<h2>Submit user informatation</h2>
<hr>
<form:form action="displayUserInfo" modelAttribute="user">

Name: <form:input path="name" required="true" placeholder="Enter name"/>

<p>
Gender: <form:radiobuttons path="gender" items="${genderMap}" required="true"/>

</p>

<p>
Country: <form:select path="country" items="${countryMap}" /> 
</p>

Introduction: <form:textarea path="introduction" required="true"/>
<p/>

Interests : 
TV Shows: <form:checkbox path="interests" value="TV Shows" />
Games: <form:checkbox path="interests" value="Games" />
Reading: <form:checkbox path="interests" value="Reading" />

<p/>
Accept agreement: <form:checkbox path="" value="accept" required="true" />
<p/>
<input type="submit" value="Submit">
</form:form>
</body>
</html>
