package com.seleniumexpress.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seleniumexpress.entity.Song;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory = null;
	
	

	public static SessionFactory getSessionFactory() {
		
		try {
			
			if(sessionFactory == null) {

				// create configuration
				Configuration configuration = new Configuration();
				configuration.configure();
				configuration.addAnnotatedClass(Song.class);

				// create session factory
				sessionFactory = configuration.buildSessionFactory();
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			
			System.out.println("Session Factory Object  not created because of some issue");
		}
		
		
		return sessionFactory;
	}
	

}
 
