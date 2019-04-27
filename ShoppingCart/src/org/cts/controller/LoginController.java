package org.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.cts.beans.User;
import org.cts.service.UserService;
import org.cts.service.UserServiceImpl;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserService service=new UserServiceImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		User user=service.validateUser(uname, pwd);
		RequestDispatcher rd=null;
		if(user!=null)
		{
			HttpSession session=request.getSession();
			session.setAttribute("uname", user.getUname());
			session.setAttribute("type", user.getUtype());
			if(user.getUtype().equals("customer"))
			{
				rd=request.getRequestDispatcher("home.jsp");
				
			}
			else
			{
				rd=request.getRequestDispatcher("home.jsp");
			}
			rd.forward(request, response);
			
		}
		else
		{
			request.setAttribute("msg", "Invalid User Name and Password");
			rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
	}

}
