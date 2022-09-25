<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignIn Page</title>
</head>
<body>
	<div align="center">
		<h2>
			<b>Sign In</b>
		</h2>
		<form:form action="writeComment" method="post" modelAttribute="user">
			<form:label path="email">Email:</form:label>
			<form:input path="email" />
			<br>
			<br>
			<form:label path="password">Password:</form:label>
			<form:password path="password" />
			<br>
			<br>
			<button>Log In</button>
			<br>
			<br>
			Don't have an account? <a href="/register">Sign Up</a>
		</form:form>
	</div>
</body>
</html>