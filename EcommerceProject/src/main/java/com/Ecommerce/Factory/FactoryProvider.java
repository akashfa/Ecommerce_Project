package com.Ecommerce.Factory;


	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;

	public class FactoryProvider {

	private static SessionFactory factory=null;

	public static  SessionFactory getFactory() {
		try {
		if(factory==null) {
		factory=new Configuration().configure().buildSessionFactory();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return factory;
	}


	}


