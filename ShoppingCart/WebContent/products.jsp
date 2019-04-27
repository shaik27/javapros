<%@page import="org.cts.beans.Product"%>
<%@page import="java.util.List"%>
<%@include file="./includes/header.jsp"%>
<%@include file="./includes/navbar.jsp"%>
<section class="products">
	<%
		List<Product> products=(List<Product>)request.getAttribute("products");
		if(products!=null)
		{
			for(Product prod:products)
			{
	%>
	<article class="product">
		<h4><%=prod.getTitle()%></h4>
		<div>
			<img class="img" src="<%=prod.getImageUrl()%>" alt="images">
		</div>
		<h5><%=prod.getPrice()%></h5>
		<h6><%=prod.getDesc()%></h6>
		<div class="actions">
			<a href="#">Delete</a> <a href="#">Edit</a>
		</div>
	</article>

	<%
			}
		}
		else
		{
	%>
		<h3>No Products Found</h3>
	<%
		}
	%>

</section>
<%@include file="./includes/footer.jsp"%>