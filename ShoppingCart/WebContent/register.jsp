<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="reg" method="post">
	UserName<input type="text" name="uname"><br>
	Password<input type="password" name="pwd"><br>
	Utype<select name="type">
		<option value="admin">Admin</option>
		<option value="customer">Customer</option>
	</select><br>
	<input type="submit" value="Register">
	</form>
</body>
</html>