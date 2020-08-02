<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Current date is: ${date}
<br>
Hello ${name}!
<br>
<hr>
List of team members:
<c:forEach var="val" items="${team}">
	<br>${val}
</c:forEach>

</body>
</html>