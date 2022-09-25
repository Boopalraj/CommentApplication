<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Success</title>
</head>
<body>
	<div align="center">
		<h2>Registration Failed!</h2>
		<span>User already exists with E-mail: </span><span>${user.email}</span><br> <br>
	</div>
</body>
</html>