package com.muditasoft.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	private final static SessionFactory factory = new Configuration().configure("/META-INF/hibernate.cfg.xml").buildSessionFactory();
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
