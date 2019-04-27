<%@include file="../includes/header.jsp" %>
<%@include file="../includes/navbar.jsp" %>

<div class="product-form" style="margin: auto">
	<table>
		<form action="addProduct" method="post">
		<tr>
			<td>Title</td><td><input type="text" name="title"></td>
		</tr>
		<tr>
			<td>ImageUrl</td><td><input type="text" name="image"></td>
		</tr>
		<tr>
			<td>price</td><td><input type="text" name="price"></td>
		</tr>
		<tr>
			<td>Description</td><td><input type="text" name="desc"></td>
		</tr>
		<tr>
			<td><input type="submit" value="Add"></td>
		</tr>
		</form>
	</table>
	
</div>

<%@include file="../includes/footer.jsp" %>