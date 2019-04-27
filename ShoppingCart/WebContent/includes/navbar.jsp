<%
		String uname=(String)session.getAttribute("uname");
		String utype=(String)session.getAttribute("type");
	
	%>
<header class="main-header">
        <nav class="main-nav">
            <ul class="main-nav__items">
                
                <%
                	if(utype.equals("admin"))
                	{
                %>
                <li class="main-nav__item">
                    <a href="addProduct.jsp">Add Product</a>
                </li>
                <li class="main-nav__item">
                    <a href="display">AdminProducts</a>
                </li>
                 
               <%
                }
                	else
                	{
                %>
                <li class="main-nav__item">
                    <a href="#">Shop</a>
                </li>
                <li class="main-nav__item">
                    <a href="#">Orders</a>
                </li>
                <li class="main-nav__item">
                    <a href="#">Cart</a>
                </li>
               <%
                	}
               %>
               <li class="main-nav__item ">
                    <a class="main-nav__item__highlighted" href="logout">Logout</a>
                </li>
            </ul>
        </nav>
    </header>