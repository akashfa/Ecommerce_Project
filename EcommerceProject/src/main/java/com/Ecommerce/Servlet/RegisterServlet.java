package com.Ecommerce.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Ecommerce.Entities.User;
import com.Ecommerce.Factory.FactoryProvider;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String userName=request.getParameter("user_name");
		 String userEmail=request.getParameter("user_email");
		 String userPassword=request.getParameter("user_password");
		 String userPhone=request.getParameter("user_phone");
		 String userAddress=request.getParameter("user_address");
		 
		          PrintWriter out = response.getWriter();
         if(userName.isEmpty() ||userEmail.isEmpty()||userPassword.isEmpty()||userPhone.isEmpty()||userAddress.isEmpty()) {
        	out.println("some problem");
        	 return;
         }
		User user=new User(userName,userEmail,userPassword,userPhone,"index.pjg",userAddress,"normalType");
		SessionFactory sessionFactory= FactoryProvider.getFactory();
		Session session=  sessionFactory.openSession();
		Transaction tx =session.beginTransaction();
		int userId=(int)session.save(user);
		
		
		HttpSession httpSession=request.getSession();
		httpSession.setAttribute("message", "User Successfully add::"+userId);
		response.sendRedirect("Register.jsp");  
		tx.commit();
		session.close();
	}

	

}
