package com.seleniumexpress.hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.seleniumexpress.entity.Song;
import com.seleniumexpress.utils.HibernateUtils;

public class UpdateApp {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		// 1-> RIM ZIM GIRE SAWAN


//    	Song song = new Song();
//    	song.setId(1);
//    	song.setSongName("RIM ZIM GIRE SAWAN - UPDATE");
//    	song.setSinger("Kishor Kumar");
//    	
		if (sessionFactory != null) {
			
			Session session = sessionFactory.openSession();

			Song song = session.get(Song.class, 5);
			System.out.println(song);
			// song.setSongName("KAL HO NA HO - UPDATED");

			session.beginTransaction();
			song.setSongName("Beliver - updated..without update");

			//session.update(song);
			session.getTransaction().commit();
			
			session.close();
			
			song.setSongName("abc");
			
			System.out.println(song);
			Session newSession = sessionFactory.openSession();
			newSession.beginTransaction();
			newSession.update(song);
			newSession.getTransaction().commit();
			
		}

	}
}
