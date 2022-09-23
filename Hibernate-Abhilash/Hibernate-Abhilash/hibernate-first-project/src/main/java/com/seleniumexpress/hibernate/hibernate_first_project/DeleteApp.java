package com.seleniumexpress.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.seleniumexpress.entity.Song;
import com.seleniumexpress.utils.HibernateUtils;

public class DeleteApp {

	public static void main(String[] args) {

		SessionFactory sessionFactory =HibernateUtils.getSessionFactory();
    	
		Session session = sessionFactory.openSession();
		
		//load that oblect that I want to delete
		Song song = session.get(Song.class , 1);
		session.beginTransaction();
		// delete the object which I want to delete
		session.delete(song);
		
		session.getTransaction().commit();
	}

	

}
