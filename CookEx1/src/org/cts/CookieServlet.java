package org.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/srv1")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		Cookie cookie1=new Cookie("name", "ksrao");
		Cookie cookie2=new Cookie("address", "chennai");
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		pw.println("<h2>cookies added successfully</h2>");
		pw.println("<a href='display'>Display Cookies</a>");
		pw.close();
	}

}
