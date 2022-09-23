package com.seleniumexpress.ioc;

public class Jio implements Sim{

	public Jio() {

		System.out.println("Jio Contructor called");
	}
	
	@Override
	public void calling() {
	System.out.println(" Calling using jio mobile");
		
	}

	@Override
	public void data() {
		System.out.println(" Browsing using jio data");

	}

}
