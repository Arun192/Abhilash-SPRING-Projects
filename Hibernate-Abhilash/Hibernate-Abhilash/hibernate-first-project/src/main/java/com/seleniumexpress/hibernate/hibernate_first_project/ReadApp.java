package com.seleniumexpress.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.seleniumexpress.entity.Song;
import com.seleniumexpress.utils.HibernateUtils;

public class ReadApp {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Song song = session.get(Song.class, 3);
		boolean contains = session.contains(song);
		System.out.println("Does the song Object Managed by Session  " + contains);
		session.getTransaction().commit();

		System.out.println(song);
		session.close();
		
		session.detach(song);
		System.out.println("Does the song Object Managed by Session  " + session.contains(song));

	}

}
