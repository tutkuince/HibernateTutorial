package com.hibernatetutorial.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
	private static SessionFactory factory = new Configuration().configure("/META-INF/hibernate.cfg.xml").buildSessionFactory();
	
	public static Session getSession() {
		return factory.openSession();
	}
}
