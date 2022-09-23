package com.seleniumexpress.ioc;

public class Airtel implements Sim{

	public Airtel() {

		System.out.println("Airtel Contructor called");
	}
	
	@Override
	public void calling() {
	System.out.println(" Calling using airtel mobile");
		
	}

	@Override
	public void data() {
		System.out.println(" Browsing using airtel data");

	}

}
