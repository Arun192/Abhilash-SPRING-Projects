package com.seleniumexpress.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
//		Airtel air = (Airtel) context.getBean("airtel");
//		air.calling();
//		air.data();

		Sim sim = context.getBean("sim" , Sim.class);
		sim.calling();
		sim.data();
		
		
		/*
		 * Airtel airtel = new Airtel(); airtel.calling(); airtel.data();
		 * 
		 * System.out.println("=============================="); Sim sim = new
		 * Vodafone(); sim.calling(); sim.data();
		 */
	}
}
