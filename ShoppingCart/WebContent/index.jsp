<%@page import="java.util.Date"%>
<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		UserName<input type="text" name="uname"><br>
		Password<input type="password" name="pwd"><br>
		<input type="submit" value="Login">
		<a href="register.jsp">Click Here</a> to Register
	</form>
	<span style="color:red">${requestScope.msg}</span>
</body>
</html>