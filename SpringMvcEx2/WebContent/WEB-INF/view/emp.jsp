<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error
{
	color:red;
}
</style>

</head>
<body>
<f:form action="processForm" modelAttribute="emp">
     Eno<f:input path="eno"/><br>
     Name<f:input path="name"/><br>
     <f:errors path="name" cssClass="error"></f:errors>
     address<f:input path="address"/><br>
     <input type="submit" value="Submit">
</f:form>	
<span style="color:red">${msg}</span>

</body>
</html>