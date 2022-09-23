package com.seleniumexpress.hibernate.hibernate_first_project;

import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.seleniumexpress.entity.Song;
import com.seleniumexpress.utils.HibernateUtils;

public class CreateApp {
	public static void main(String[] args) throws IllegalStateException, SystemException {

		// create session factory
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		// Initialize the session object
		Session session = sessionFactory.openSession();

		Transaction trans = (Transaction) session.getTransaction();

		try {
			Song song1 = new Song();
			// song1.setId(5);
			song1.setSongName("Rahul Jain all Songs - new");
			song1.setSinger("Rahul Jain - new");

			session.beginTransaction();

			session.save(song1);
			trans.commit();

			System.out.println("song save .. check db..");

		} catch (Exception e) {

			trans.rollback();
		}

		finally {
			session.close();

		}

	}
}