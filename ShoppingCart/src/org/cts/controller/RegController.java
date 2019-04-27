package org.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.cts.beans.User;
import org.cts.service.UserService;
import org.cts.service.UserServiceImpl;


@WebServlet("/reg")
public class RegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	UserService service=new UserServiceImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		String type=request.getParameter("type");
		boolean b=service.register(new User(0, uname, pwd, type));
		if(b)
		{
			request.setAttribute("msg", "successfully registered");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
		
	}

}
