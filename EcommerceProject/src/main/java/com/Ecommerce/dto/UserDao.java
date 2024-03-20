package com.Ecommerce.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.Ecommerce.Entities.User;

public class UserDao {
	private SessionFactory factory=null;

	public UserDao(SessionFactory factory) {
		
		this.factory = factory;
	}

	public User getEmailAndPass(String email,String password) {
		  User user=null;
		  String qurey ="from User where userEmail= :e and userPassword= :p";
		 Session session=this.factory.openSession();
		    Query q =session.createQuery(qurey);
		    q.setParameter("e", email);
		    q.setParameter("p",password);
		 user= (User) q.uniqueResult();
		  return user;
	}

	
	

}
