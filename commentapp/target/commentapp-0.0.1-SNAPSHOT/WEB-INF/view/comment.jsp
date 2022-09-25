<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Comment Here</title>
</head>
<body>
	<div align="right">
		<span>Signed in as: </span> <span>${post.email}</span> <br> <br>
		<a href="/">Sign Out</a> <br> <br>
	</div>
	<div align="left">
		<form:form action="/postComment" method="post" modelAttribute="post">
		What would you like to share with world?<br>
			<br>
			<form:label path="comments">Comment:</form:label>
			<form:textarea path="comments" rows="5" cols="25" />
			<br>
			<br>
			<form:button>Post</form:button>
		</form:form>
	</div>
</body>
</html>