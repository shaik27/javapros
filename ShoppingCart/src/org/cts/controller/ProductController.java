package org.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cts.beans.Product;
import org.cts.service.ProductService;
import org.cts.service.ProductServiceImpl;


@WebServlet("/addProduct")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ProductService service=new ProductServiceImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String title=request.getParameter("title");
		String imageUrl=request.getParameter("image");
		String price=request.getParameter("price");
		String desc=request.getParameter("desc");
		boolean b=service.addProduct(new Product(0, title, imageUrl, price, desc));
		if(b)
		{
			RequestDispatcher rd=request.getRequestDispatcher("display");
			rd.forward(request, response);
		}
		
	}

}
