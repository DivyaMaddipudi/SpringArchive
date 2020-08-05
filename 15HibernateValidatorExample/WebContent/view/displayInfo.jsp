<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Data</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>
Name: ${user.name}
<p/>
Gender: ${user.gender}
<p/>
Introduction: ${user.introduction}
<p/>
Country: ${user.country}
<p/>
<c:forEach var="interest" items="${user.interests }">
<ul>
<li>
${interest}
</li>
</ul>
</c:forEach>


</body>
</html>