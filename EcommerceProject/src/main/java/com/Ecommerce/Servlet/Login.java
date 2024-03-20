package com.Ecommerce.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Ecommerce.Entities.User;
import com.Ecommerce.Factory.FactoryProvider;
import com.Ecommerce.dto.UserDao;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=	response.getWriter();
	 String email=request.getParameter("user_email");
	 String password=request.getParameter("user_password");
	 
	 UserDao userdao=new UserDao(FactoryProvider.getFactory());
	User user=  userdao.getEmailAndPass(email, password);
	 HttpSession session=  request.getSession();
	if(user==null) {
		session.setAttribute("message", "user invalid");
		response.sendRedirect("Login.jsp");
	}
	session.setAttribute("current-user", user);
	if(user.getUserType().equals("admin")) {
		response.sendRedirect("admin.jsp");
	}else if(user.getUserType().equals("normalType")) {
		response.sendRedirect("normal.jsp");
	}else {
		response.sendRedirect("user not exigest ");
	}

}

}