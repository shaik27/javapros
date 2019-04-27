<%
	if(session.getAttribute("uname")!=null)
	{
%>
<%@include file="./includes/header.jsp"%>
	<%@include file="./includes/navbar.jsp" %>
    <div>
    	Welcome <%=uname%>
    </div>
    <!--
        display product
    -->
    
<%@include file="./includes/footer.jsp"%>
<%
	}
	else
	{
		response.sendRedirect("index.jsp");
	}
%>