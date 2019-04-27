package org.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cts.beans.Product;
import org.cts.service.ProductService;
import org.cts.service.ProductServiceImpl;

/**
 * Servlet implementation class DisplayController
 */
@WebServlet("/display")
public class DisplayController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ProductService service=new ProductServiceImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		List<Product> products=service.getProducts();
		request.setAttribute("products", products);
		RequestDispatcher rd=request.getRequestDispatcher("products.jsp");
		rd.forward(request, response);
		pw.close();
		
	}

}
